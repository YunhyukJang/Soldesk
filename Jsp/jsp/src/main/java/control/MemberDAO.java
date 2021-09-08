package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberDAO {
	//Oracle DB에 연결해서 select, insert, update, delete....작업을 실행해주는 메서드들의 클래스
	//Oracle에 접속하는 코드 작성
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pw="12341234";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//Oracle 연동
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection(url, user, pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//1. DB에 한 사람의 가입을 저장해주는 메서드
	public void insertMember(MemberDBBean mBean) {
		try {
			//DB 연동 코드 생략이 가능하도록 메서드 호출
			getConn();
			
			//접속 후 query 구현
			String sql="insert into member values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			//query가 작동하도록 준비
			pstmt=conn.prepareStatement(sql);
			
			//?에 맞게 data mapping
			pstmt.setString(1, mBean.getId());
			pstmt.setString(2, mBean.getPw1());
			pstmt.setString(3, mBean.getPw2());
			pstmt.setString(4, mBean.getEmail());
			pstmt.setString(5, mBean.getGender());
			pstmt.setString(6, mBean.getAddress());
			pstmt.setString(7, mBean.getPhone());
			pstmt.setString(8, mBean.getHobby());
			pstmt.setString(9, mBean.getJob());
			pstmt.setString(10, mBean.getAge());
			pstmt.setString(11, mBean.getInfo());
			
			//Oracle에 data 입력
			pstmt.executeUpdate();
			
			//자원 반납
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//2. 모든 회원의 정보를 출력하는 메서드
	public Vector<MemberDBBean> allSelectMember(){
		Vector<MemberDBBean> v=new Vector<MemberDBBean>();
		
		try {
			getConn();
			
			String sql="Select * from member";
			
			pstmt=conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDBBean bean=new MemberDBBean();
				
				bean.setId(rs.getString(1));
				bean.setPw1(rs.getString(2));
				bean.setPw2(rs.getString(3));
				bean.setEmail(rs.getString(4));
				bean.setGender(rs.getString(5));
				bean.setAddress(rs.getString(6));
				bean.setPhone(rs.getString(7));
				bean.setHobby(rs.getString(8));
				bean.setJob(rs.getString(9));
				bean.setAge(rs.getString(10));
				bean.setInfo(rs.getString(11));
				
				v.add(bean);
			}
			
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return v;
	}
}
