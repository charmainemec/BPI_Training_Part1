package m4.activity5;

public class AccountValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== Account Number Validation Test ===");
		System.out.println("");
		testValidation("Test 1: Valid account (1234567890)", "1234567890");
		System.out.println("");
		testValidation("Test 2: Too short (123)", "123");
		System.out.println("");
		testValidation("Test 3: Contains letters (12345ABC90)", "12345ABC90");
		System.out.println("");
		testValidation("Test 4: Contains space (1234 567890)", "1234 567890");
		System.out.println("");
		testValidation("Test 5: Null value", null);
	}
	public static void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException {
		
			if (accountNumber == null) {
				throw new NullPointerException("Warning: Account number cannot be null");
			}else if (isDigit(accountNumber) == false) {
				throw new InvalidAccountFormatException("Warning: Account number must contain only digits");
			}else if (accountNumber.length() != 10) {
				throw new InvalidAccountNumberException("Error: Account number must be exactly 10 digits");
			}else {
				System.out.println("Valid account number: " + accountNumber);
			}

	}
	public static boolean isDigit(String accountNumber) {
		boolean digit = true;
		for (char c : accountNumber.toCharArray()) {
			if (!Character.isDigit(c)) {
				//System.out.println("is Digit:" + c + Character.isDigit(c));
				digit = false;
			}
			
		}
		return digit;
	}
	public static void testValidation(String testName, String accountNumber) {
		
		System.out.println("Test Name: " + testName);
		try {
		validateAccountNumber(accountNumber);
		}catch(InvalidAccountNumberException e){
			System.out.println(e.getMessage());
		}catch(InvalidAccountFormatException e){
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
/*
 * Step 3: Create method validateAccountNumber(String accountNumber)
• In method signature, add: throws InvalidAccountNumberException
Note: Only InvalidAccountNumberException is declared in throws (checked exception). The unchecked exceptions don't need to be
declared!
• Inside method, implement these validations IN ORDER:
• Check for null:
• If accountNumber is null → throw NullPointerException("Account number cannot be null")
• Check format:
• If contains non-digits → throw InvalidAccountFormatException("Account number must contain only digits")
• Hint: Use for loop for (char c : accountNumber.toCharArray()) with if (!Character.isDigit(c)) then throw
• Check length:
• If length != 10 → throw InvalidAccountNumberException("Account number must be exactly 10 digits")
• 4. If valid:
• Print: "Valid account number: [accountNumber]"
Step 4: Create helper method testValidation(String testName, String accountNumber) to avoid repeating try-catch blocks
• Inside method:
• Print the test name
• Call validateAccountNumber inside try block
• Catch three exceptions: InvalidAccountNumberException, InvalidAccountFormatException, NullPointerException
• Print error messages
Step 5: In main() method, test FIVE cases
Use the testValidation helper method to test:
1. "1234567890" - valid (10 digits)
2. "123" - too short
3. "12345ABC90" - contains letters
4. "1234 567890" - contains space
5. null - null value*/
 