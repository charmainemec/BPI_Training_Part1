package m3.actvitiy2;


import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

public class Activity2 {

    static Set<String> products = new HashSet<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    
	 
	    products.add("Laptop");
	    products.add("Mouse");
	    products.add("Keyboard");
	    products.add("Monitor");
	    products.add("WebCam");
	    
		char option;
		 
		do
		{
			System.out.println("1. Search a product");
			System.out.println("2. Add a product");
			System.out.println("3. Print all products and count");
			System.out.println("4. Exit");
			
		
		System.out.print("Enter Choice:");
		
		option = sc.next().toUpperCase().charAt(0);
		sc.nextLine();
		
		switch (option)
		{
		case '1':
			searchProduct();
			break;
        case '2':
        	addProduct();
        	break;
        case '3':
        	displayProducts();
        	break;
        case '4':
        	System.out.println("Exiting..  ");
        	System.exit(0);
        default:
            System.out.println("Invalid option! Please try again.\n");
		}
     }
  while (option != '4');
	sc.close();
	       

	}
	
	public static void searchProduct(){
		System.out.println("Enter product name to search: ");
		 String searchProduct=sc.nextLine();
		 
		    if (products.contains(searchProduct)){
		    	System.out.println("Product found: "+ searchProduct);
		   
		    }else {
		    	
		    	System.out.println("Product NOT found: "+ searchProduct);
		    }
		
	}
	public static void addProduct(){
		System.out.println("Enter product name to add: ");
		String addProduct=sc.nextLine();
		products.add(addProduct);

		System.out.println("Product Added: "+ addProduct);
		 	//System.out.println(products);
	}
	
	public static void displayProducts(){
		System.out.println("All Products:");

	
	    for (String product: products) {    	
	    	System.out.println(product);
	    }
	    
		System.out.println("Total unique products: "+ products.size());
	}
}
