/**
 * 
 */
package ph.com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class Main {
	static void display(Integer int1, Integer int2) { 
		
        System.out.println("Sum: " + (int1 + int2));
        System.out.println("Difference: " + (int1 - int2));
        System.out.println("Product: " + (int1 * int2));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
			System.out.println("Enter first integer:");
          String input1 = input.next();
          int int1 = Integer.parseInt(input1);
          System.out.println("Enter second integer:");
          String input2 = input.next();
          int int2 = Integer.parseInt(input2);
		  
          Main.display(int1, int2);
                        
                  
	}

}
