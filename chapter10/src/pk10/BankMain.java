package pk10;

public class BankMain {

	public static void main(String[] args) {
		Bank bank1=new Bank("Dubai", "001");
		
		//bank1.interest=1.2f;
		Bank.interest=1.2f;
		
		bank1.getBank();
		
		Bank bank2=new Bank("Mumbai","002");
		
		bank2.getBank();
	}
}
