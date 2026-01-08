package m4.activity4;

public class AccountValidator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          validateAccountNumber("1234567890");
          validateAccountNumber("123");
		  validateAccountNumber(null);
	}
    public static void validateAccountNumber(String accountNumber) {
    
    	try {
    		
    		if (accountNumber == null){
    			throw new NullPointerException("Error: Cannot be null");
    		}
    		else if (accountNumber.length() < 10){
    			throw new Exception("Error: Must be 10 digits");
    			
    		}else {
    		System.out.println("Valid account: " + accountNumber);
    		}
    	}catch(Exception e) {
    		System.err.println(e.getMessage());
    	 	}

    }
	
	
}
