/**
 * 
 */
package ph.com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class Main {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
			System.out.println("What is your age?");
          String age = input.next();
		  int intAge = Integer.parseInt(age);
		  double doubleAge = Double.parseDouble(age);
		  
         System.out.println("Age in Integer " + intAge);
         System.out.println("Age in Double " + doubleAge);
       
	}
}

