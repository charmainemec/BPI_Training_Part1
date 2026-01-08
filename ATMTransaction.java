package m4.activity3;

public class ATMTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== ATM BALANCE INQUIRY SYSTEM ===");
		System.out.println("");
		System.out.println("--- Test Case 1: Valid Savings Account ---");
		checkBalance("100123456", 15000.00);
		System.out.println("");
		System.out.println("--- Test Case 2: Valid Checking Account ---");
		checkBalance("200987654", 25000.00);
		System.out.println("");
		System.out.println("--- Test Case 3: Invalid Account Number Format ---");
		checkBalance("ABC12345", 15000.00);
		System.out.println("");
		System.out.println("--- Test Case 4: Empty Account Number ---");
		checkBalance("", 15000.00);
	}
    public static void checkBalance(String accountNumber, double balance) {
    	
    	try {
    		System.out.println("Processing balance inquiry...");
    		char accountType = accountNumber.charAt(0);
    		Integer accountNo = Integer.parseInt(accountNumber);
    		
    		//System.out.println("Account Type: " + accountType);
    		if (accountType == '1'){
    			System.out.println("Account Type: Savings");
        		System.out.println("Account Number: " + accountNumber);
        		System.out.println("Current Balance: ₱" + balance);
        		System.out.println("Balance inquiry successful!");
    		}else if (accountType == '2') {
    			System.out.println("Account Type: Checking");
        		System.out.println("Account Number: " + accountNumber);
        		System.out.println("Current Balance: ₱" + balance);
        		System.out.println("Balance inquiry successful!");
    		}else {
    			System.out.println("Account Type: Unknown");
    		}

    	}catch(NumberFormatException e) {
        	System.out.println("Error: Invalid account number format! " + 
    	         "Account numbers must be numeric.");
    	}catch(StringIndexOutOfBoundsException e) {
            	System.out.println("Error: Account number is "
            			+ "empty or invalid!");
        }finally {
        	System.out.println("");
        	System.out.println("\n========== RECEIPT ==========");
        	System.out.println("Transaction Date: December 3, 2025");
        	System.out.println("Transaction Type: Balance Inquiry");
        	System.out.println("ATM Location: Main Branch");
        	System.out.println("Thank you for banking with us!");
        	System.out.println("==============================\n");
        }
    	}
    }

/*Instructions:
1. Create a class called ATMTransaction
2. Create method: checkBalance(String accountNumber, double balance)
• Inside the method:
• Try Block:
• Print "Processing balance inquiry..."
• Validate account number format by converting to integer:
Integer.parseInt(accountNumber)
• Get account type from first character: char accountType = accountNumber.charAt(0)
• Determine account type name:
• If accountType == '1' → Print "Account Type: Savings"
• If accountType == '2' → Print "Account Type: Checking"
• Otherwise → Print "Account Type: Unknown"
• Print "Account Number: " + accountNumber
• Print "Current Balance: ₱" + balance
• Print "Balance inquiry successful!"
• Write TWO catch blocks:
• catch (NumberFormatException e) → Print "Error: Invalid account number format!
Account numbers must be numeric."
• catch (StringIndexOutOfBoundsException e) → Print "Error: Account number is
empty or invalid!"
• Write finally block (ALWAYS executes):
• Print "\n========== RECEIPT =========="
• Print "Transaction Date: December 3, 2025"
• Print "Transaction Type: Balance Inquiry"
• Print "ATM Location: Main Branch"
• Print "Thank you for banking with us!"
• Print "==============================\n"*/