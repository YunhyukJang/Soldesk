package jspbook.ch10;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ItemTagHandler extends SimpleTagSupport {
	//Tag 속성
	private String border;
	private String bgcolor;
	
	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

	public String getBgcolor() {
		return bgcolor;
	}

	public void setBgcolor(String bgcolor) {
		this.bgcolor = bgcolor;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		//JSP out 객체 생성
		JspWriter out=getJspContext().getOut();
		
		//body tag 처리 객체
		JspFragment body=getJspBody();
		
		Product product=new Product();
		
		StringBuffer msg=new StringBuffer(); //속도 향상을 위해 한 번에 tag를 담아서 처리 *추가 변경 가능
		
		if(body != null) {
			out.println("<h2>");
			
			body.invoke(null); //invoke=body에 반환 값을 전달하기 위해서 생성
			
			out.println("</h2>");
		}
		
		//<table border="1" bgcolor="skyblue" width="150">
		msg.append("<table border=").append(border).append(" bgcolor=").append(bgcolor)
		.append(" width='150'>");
		
		out.println(msg.toString());
		
		//상품 목록 출력
		for(String item:product.getProductList()) {
			out.println("<tr><td>"+item+"</td></tr>");
		}
		
		out.println("</table>");
	}
}
