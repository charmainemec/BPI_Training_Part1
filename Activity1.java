package m3.actvitiy1;

import java.util.*;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    List<String> products = new ArrayList<>();
 
    products.add("Laptop");
    products.add("Mouse");
    products.add("Keyboard");
    products.add("Monitor");
   
    System.out.println(products);
   // products.forEach(System.out::println);
    for (String product: products) {    	
    	System.out.println(product);
    }
    products.add("Webcam");
    products.remove("Mouse");
   // System.out.println(product);
    System.out.println("After Adding and Removing the products:");
   // products.forEach(System.out::println);
    
    for (String product: products) {    	
    	System.out.println(product);
    }
    
	System.out.print("Enter Product Name to Search:");
	 String searchProduct=sc.nextLine();
	 
    if (products.contains(searchProduct)){
    	System.out.println("Product found");
   
    }else {
    	
    	System.out.println("Product NOT found");
    }

	}
    
}
