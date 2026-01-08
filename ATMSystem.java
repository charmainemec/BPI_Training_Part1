package m4.activity2;

public class ATMSystem {

	 static double [] accounts = {10000, 15000, 20000};
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		System.out.println("=== ATM Withdrawal System ===");
		System.out.println("");
		System.out.println("--- Test 1: Valid Withdrawal ---");
		processWithdrawal("1", "5000");

		System.out.println("");
		System.out.println("--- Test 2: Invalid Account Index ---");
		processWithdrawal("abc", "5000");

		System.out.println("");
		System.out.println("--- Test 3: Account Not Found ---");
		processWithdrawal("10", "5000");
		
		System.out.println("");
		System.out.println("--- Test 4: Insufficient Funds ---");
		processWithdrawal("1", "20000");
	}
	
	public static void processWithdrawal(String accountIndex, String amountInput) {
		double balance=0;
		double amount=0;
		try {
			System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);
			balance = accounts[Integer.parseInt(accountIndex)];
			System.out.println("Current balance: P" + balance);
			amount = Double.parseDouble(amountInput);
			System.out.println("Withdrawal: P" + amount);
			if (amount>balance){				
				System.out.println("Insufficient funds! Cannot withdraw P" + amount);
			}else {
				balance = balance - amount;
				System.out.println("New balance: P" + balance);
				System.out.println("Withdrawal successful!");
			}
		}catch(NumberFormatException e) {
    		System.out.println("Error: Invalid input");
    		System.out.println("Please enter valid numbers.");
		}catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("Error: Account not found!");
    		System.out.println("Invalid account index.");
		}catch(Exception e) {
    		System.out.println("Error: Transaction failed");
		}
	}

}
