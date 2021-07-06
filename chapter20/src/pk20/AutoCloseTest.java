package pk20;

public class AutoCloseTest {

	public static void main(String[] args) {
		try(AutoCloseObj obj=new AutoCloseObj()) {
			throw new Exception(); //예외 발생
		}catch (Exception e) {
			System.out.println("예외 발생");
		}
		
		//자바 9version 이후 밖에서 선언해도 사용 가능
		/*
		 * AutoCloseObj obj=new AutoCloseObj();
		 * 
		 * try(obj) { throw new Exception(); 
		 * }catch(Exception e) {
		 * System.out.println("예외 발생"); 
		 * }
		 */
	}
}
