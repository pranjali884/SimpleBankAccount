package simpleBankAccount;

public class Account {

	private String Acnumber;
	private double balance;
	private String name;
	private String Email;
	private String mobile;
	
	//using constructor
	public Account(String Acnumber,double balance,String name,String Email,String mobile)
	{
		this.Acnumber=Acnumber;
		this.balance=balance;
		this.name=name;
		this.Email=Email;
		this.mobile=mobile;	
	}
	
	//create deposite method
	
	public void DepositeMoney(double DepositedMoney)
	{
		this.balance+= DepositedMoney;
		
		//printing balance after deposited money
		System.out.println("Deposite is successfully..new balance is"+this.balance);
	}
	//create Withdraw method
	
	public void Withdraw(double WithdrawlMoney)
	{
		if(this.balance - WithdrawlMoney < 0)
		{
			System.out.println("withdraw unsuccessful only "+ this.balance + "is left");
		}
		else
		{
			this.balance-=WithdrawlMoney;
			
			System.out.println("withdrawl money is successful,current balance is"+this.balance);
		}
	}
	public String getAcnumber() {
		return Acnumber;
	}
	public void setAcnumber(String acnumber) {
		Acnumber = acnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
