package simpleBankAccount;

public class Main {

	public static void main(String[] args) {
		
Account PranjuAccount =new Account("14256789",0.0, "Pranjali", "Pranju@gmail.com", "92452678");
		
		PranjuAccount.DepositeMoney(1000);
		
		PranjuAccount.DepositeMoney(200);
		PranjuAccount.Withdraw(100);
		
		
	}

}
