package pk13;

public class InterMain implements Inter_Menu3 {
	@Override
	public String jjajang() {
		return "하나 죽으면 아는 짜장면";
	}

	@Override
	public String jjambbong() {
		return "짬뽕이냐? 잠뽕이냐?";
	}

	@Override
	public String tangsuyuk() {
		return "찹쌀 탕수육";
	}

	@Override
	public String boggembab() {
		return "다섞어 볶음밥";
	}
	
	public static void main(String[] args) {
		InterMain im=new InterMain();
		Inter_Menu1 im1=im;
		Inter_Menu2 im2=im;
		Inter_Menu3 im3=im;
		
		System.out.println("-----우리 집 메뉴판-----");
		System.out.println(im.jjajang());
		System.out.println(im1.jjambbong());
		System.out.println(im2.tangsuyuk());
		System.out.println(im3.boggembab());
	}
}
