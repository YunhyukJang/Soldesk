package pk12_2;

public class HttpServletExample {
	//method
	public static void method(HttpServlet httpServlet) {
		httpServlet.service();
	}

	public static void main(String[] args) {
		//HttpServletExample httpServletExample=new HttpServletExample();
		//생략 가능 *메서드에 매개 변수로 객체가 설정되어 있음
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
}
