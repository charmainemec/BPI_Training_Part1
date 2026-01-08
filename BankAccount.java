package m4.activity1;

import java.util.Scanner;

public class BankAccount {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== Bank Account Name Display ===");
		testCase("ACCT-001");
		testCase("ACC-999");
		System.out.println("=== Program completed successfully! ===");
		
	}
	
	public static String getAccountName(String accountNumber){
		
		    if (accountNumber == ("ACCT-001")){
		    	return "Juan dela Cruz";
		

		    }else if (accountNumber == ("ACCT-002")) {
		    	return "Maria Santos";
	    	}
		    else{
		    	return null;
		    	}
	
	}
	
	public static void testCase(String accountNumber) {
		System.out.println("Looking Up Account: " + accountNumber);
		
		try {
	    String name =getAccountName(accountNumber).toUpperCase();
	    System.out.println("Account holder: " + name);
	    }catch(NullPointerException e) {
    		System.out.println("Error: Account not found!");
		}
	}
}
