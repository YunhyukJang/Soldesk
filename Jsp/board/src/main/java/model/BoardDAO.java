package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//DB 연결 메서드
	public void getCon() {
		try {
			Context initctx=new InitialContext();
			Context envctx=(Context)initctx.lookup("java:/comp/env");
			
			DataSource ds=(DataSource)envctx.lookup("jdbc/xe");
			
			con=ds.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//#1
	//전체 게시글의 갯수를 return하는 메서드
	public int getAllCount() {
		getCon();
		
		int count=0;
		
		try {
			String sql="Select count(*) from board";
			
			pstmt=con.prepareStatement(sql); //Query 실행
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				count=rs.getInt(1); //전체 게시글의 갯수 반환
			}
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	//#2
	//화면에 보여질 data를 10개씩 추출해서 return하는 메서드
	public Vector<BoardBean> getAllBoard(int startRow, int endRow){
		getCon();
		
		Vector<BoardBean> v=new Vector<BoardBean>();
		
		try {
			//10개씩 가져오는 query *Rownum=oracle에만 있는 column
			String sql="Select * from (Select A.*, Rownum Rnum from (Select * from board order by ref "
					+ "desc, re_step asc) A) where Rnum >= ? and Rnum <= ?";
			
			pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				BoardBean bean=new BoardBean();
				
				bean.setNum(rs.getInt(1));
				bean.setWriter(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setSubject(rs.getString(4));
				bean.setPassword(rs.getString(5));
				bean.setReg_date(rs.getString(6));
				bean.setRef(rs.getInt(7));
				bean.setRe_step(rs.getInt(8));
				bean.setRe_level(rs.getInt(9));
				bean.setReadcount(rs.getInt(10));
				bean.setContents(rs.getString(11));
				
				v.add(bean);
			}
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return v;
	}
	
	//#3
	//게시글을 저장하는 메서드
	public void insertBoard(BoardBean bean) {
		getCon();
		
		//bean 객체에서 넘어오지 않았던 data를 초기화
		int ref=0; //Query를 실행시켜 가장 큰 ref 값을 가져온 후 +1
		int re_step=1; //새 글=부모 글
		int re_level=1;
		
		try {
			//BoardBean에 비어있는 data
			String refsql="Select max(ref) from board";
			
			pstmt=con.prepareStatement(refsql);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				ref=rs.getInt(1)+1; //글 그룹 설정
			}
			
			String sql="insert into board values(board_seq.nextval, ?, ?, ?, ?, sysdate, ?, ?, ?, 0, ?)";
			
			pstmt=con.prepareStatement(sql);
			
			//? mapping
			pstmt.setString(1, bean.getWriter());
			pstmt.setString(2, bean.getEmail());
			pstmt.setString(3, bean.getSubject());
			pstmt.setString(4, bean.getPassword());
			pstmt.setInt(5, ref);
			pstmt.setInt(6, re_step);
			pstmt.setInt(7, re_level);
			pstmt.setString(8, bean.getContents());
			
			pstmt.executeUpdate();
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//#4
	//한 사람의 정보를 가져오는 sql
	public BoardBean getOneBoard(int num) {
		getCon();
		
		BoardBean bean=null;
		
		try {
			//게시글을 읽으면 조회수 증가
			String countsql="update board set readcount=readcount+1 where num=?";
			
			pstmt=con.prepareStatement(countsql);
			
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
			//하나의 게시글 가져오기
			String sql="Select * from board where num=?";
			
			pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				bean=new BoardBean();
				
				bean.setNum(rs.getInt(1));
				bean.setWriter(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setSubject(rs.getString(4));
				bean.setPassword(rs.getString(5));
				bean.setReg_date(rs.getDate(6).toString());
				bean.setRef(rs.getInt(7));
				bean.setRe_step(rs.getInt(8));
				bean.setRe_level(rs.getInt(9));
				bean.setReadcount(rs.getInt(10));
				bean.setContents(rs.getString(11));
			}
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}
	
	//#5
	//답글 작성
	public void reInsertBoard(BoardBean bean) {
		getCon();
		
		int ref=bean.getRef();
		int re_step=bean.getRe_step();
		int re_level=bean.getRe_level();
		
		try {
			String levelsql="update board set re_level=re_level+1 where ref=? and re_level>?";
			
			pstmt=con.prepareStatement(levelsql);
			
			//? mapping
			pstmt.setInt(1, ref); //부모 글
			pstmt.setInt(2, re_level); //부모 레벨
			
			pstmt.executeUpdate();
			
			String sql="insert into board values(board_seq.nextval, ?, ?, ?, ?, sysdate, ?, ?, ?, 0, ?)";
			
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, bean.getWriter());
			pstmt.setString(2, bean.getEmail());
			pstmt.setString(3, bean.getSubject());
			pstmt.setString(4, bean.getPassword());
			pstmt.setInt(5, ref);
			pstmt.setInt(6, re_step+1);
			pstmt.setInt(7, re_level+1);
			pstmt.setString(8, bean.getContents());
			
			pstmt.executeUpdate();
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//#6
	//조회수는 증가하지 않고 하나의 게시글을 return하는 메서드
	public BoardBean getOneUpdateBoard(int num) {
		getCon();
		
		BoardBean bean=null;
		
		try {
			String sql="Select * from board where num=?";
			
			pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				bean=new BoardBean();
				
				bean.setNum(rs.getInt(1));
				bean.setWriter(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setSubject(rs.getString(4));
				bean.setPassword(rs.getString(5));
				bean.setReg_date(rs.getDate(6).toString());
				bean.setRef(rs.getInt(7));
				bean.setRe_step(rs.getInt(8));
				bean.setRe_level(rs.getInt(9));
				bean.setReadcount(rs.getInt(10));
				bean.setContents(rs.getString(11));
			}
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}
	
	//#7
	//게시글을 수정하는 메서드
	public void UpdateBoard(int num, String subject, String contents) {
		getCon();
		
		try {
			String sql="update board set subject=?, contents=? where num=?";
			
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, subject);
			pstmt.setString(2, contents);
			pstmt.setInt(3, num);
			
			pstmt.executeUpdate();
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//#8
	//게시글을 삭제하는 메서드
	public void DeleteBoard(int num) {
		getCon();
		
		try {
			String sql="delete from board where num=?";
			
			pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
