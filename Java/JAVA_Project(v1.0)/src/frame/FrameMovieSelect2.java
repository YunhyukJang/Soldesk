package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import vo.Movie;
import vo.MovieDAO;

public class FrameMovieSelect2 extends JPanel {
	public FrameMovieSelect2() {
	    setBackground(new Color(0xFFD700));
	    setLayout(null);
	    setSize(600, 2000);
	      
	    //영화 5
	    ImageIcon movie5=new ImageIcon("당신거기있어줄래요.png");
	    JButton btnMovie5=new JButton(movie5);
	    
	    btnMovie5.setName("당신거기있어줄래요");
	    btnMovie5.setSize(185, 250);
	    btnMovie5.setLocation(72, 30);
	    
	    add(btnMovie5);
	      
	    btnMovie5.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            Movie movie5=new MovieDAO().searchMovie("당신거기있어줄래요");
	            
	            FrameBase.getInstance(new FrameMovieInfo(movie5));
	        }
	        
	    });
	      
	    //영화 6
	    ImageIcon movie6=new ImageIcon("스파이더맨.png");
	    JButton btnMovie6=new JButton(movie6);
	    
	    btnMovie6.setName("스파이더맨"); 
	    btnMovie6.setSize(185, 250);
	    btnMovie6.setLocation(320, 30);
	    
	    add(btnMovie6);
	      
	    btnMovie6.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            Movie movie6=new MovieDAO().searchMovie("스파이더맨");
	            
	            FrameBase.getInstance(new FrameMovieInfo(movie6));
	        }
	        
	    });
	      
	    //영화 7
	    ImageIcon movie7=new ImageIcon("어벤져스.png");
	    JButton btnMovie7=new JButton(movie7);
	    
	    btnMovie7.setName("어벤져스");
	    btnMovie7.setSize(185, 250);
	    btnMovie7.setLocation(72, 340);
	    
	    add(btnMovie7);
	      
	    btnMovie7.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            Movie movie7=new MovieDAO().searchMovie("어벤져스");
	            
	            FrameBase.getInstance(new FrameMovieInfo(movie7));
	        }
	        
	    });
	      
	    //영화 8
	    ImageIcon movie8=new ImageIcon("부산행.png");
	    JButton btnMovie8=new JButton(movie8);
	    
	    btnMovie8.setName("부산행");
	    btnMovie8.setSize(185, 250);
	    btnMovie8.setLocation(320, 340);
	    
	    add(btnMovie8);
	      
	    btnMovie8.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            Movie movie8=new MovieDAO().searchMovie("부산행");
	            
	            FrameBase.getInstance(new FrameMovieInfo(movie8));
	        }
	        
	    });
	      
	    //하단의 버튼
	    JPanel bottomSet=new JPanel();

	    bottomSet.setBounds(0, 660, 600, 100);
	    bottomSet.setLayout(null);
	    bottomSet.setBackground(new Color(0xFFD700));
	         
	    JButton btnBack=new JButton("이전 페이지");

	    btnBack.setBackground(new Color(0xA6A6A6));
	    btnBack.setSize(183, 87);
	    btnBack.setLocation(5, 0);
	    btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
	         
	    bottomSet.add(btnBack);

	    btnBack.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            FrameBase.getInstance(new FrameMovieSelect());
	        }
	        
	    });
	         
	    JButton btnHome=new JButton("처음 화면으로");

	    btnHome.setBackground(new Color(0xA6A6A6));
	    btnHome.setSize(183, 87);
	    btnHome.setLocation(198, 0);
	    btnHome.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
	    
	    bottomSet.add(btnHome);

	    btnHome.addActionListener(new ActionListener() {
	    	@Override
	        public void actionPerformed(ActionEvent e) {
	    		FrameBase.getInstance(new FrameBegin());
	        }
	    	
	    });

	    add(bottomSet, BorderLayout.SOUTH);
	}
}
