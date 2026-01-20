package m4.activity6;

public class InsufficientFundsException extends Exception{

	private double balance;
	private String message;
	private double requestedAmount;

	public InsufficientFundsException(String message, double balance, double requestedAmount) {
		// TODO Auto-generated constructor stub
		this.message=message;
		this.balance=balance;
		this.requestedAmount=requestedAmount;
	}

	   public void setMessage(String message) {
		   
		   this.message=message;
	   }
	   
	   public String getMessage() {
		   
		  return this.message;
	   }
	
	   public void setBalance(double balance) {
		   
		   this.balance=balance;
	   }
	   
	   public double getBalance() {
		   
		  return this.balance;
	   }
	   public void setSequestedAmount(double requestedAmount) {
		   
		   this.requestedAmount=requestedAmount;
	   }
	   
	   public double getRequestedAmount() {
		   
		  return this.requestedAmount;
	   }
}
