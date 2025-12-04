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
			System.out.println("Enter your age:");
          String input1 = input.next();
          int int1 = Integer.parseInt(input1);
          if(int1 < 18) {
          System.out.println("Minor");
       		  
          }
          else if( int1 > 17 && int1 <60)
        	
        		 {System.out.println("Adult");
        		 }
          
          else
          System.out.println("Senior");
           
    
       
	}
}

