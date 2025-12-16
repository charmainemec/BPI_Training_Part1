package m3.actvitiy3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class M3_Activity3 {
	
    static Map<String, Integer> products = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    products.put("Laptop", 50000);
	    products.put("Mouse", 500);
	    products.put("Keyboard", 400);
	    products.put("Monitor", 5000);
	    products.put("WebCam", 459);
	    
	    char option;
		 
		do
		{
			System.out.println("1. Search a product");
			System.out.println("2. Add a product");
			System.out.println("3. Print all products and prices");
			System.out.println("4. Find the cheapest product");
			System.out.println("5. Exit");
			
		
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
            findCheapestProduct();
        	break;
        case '5':
        	System.out.println("Exiting..  ");
        	System.exit(0);
        default:
            System.out.println("Invalid option! Please try again.\n");
		}
     }
  while (option != '5');
	sc.close();
	       

	}
	public static void searchProduct(){
		System.out.println("Enter product name to search: ");
		 String searchProduct=sc.nextLine();
		 
		    if (products.containsKey(searchProduct)){
		    		System.out.println("Product found! Price: "+ products.get(searchProduct) );
		   
		    }else {
		    	
		    	System.out.println("Product not found!");
		    }
		
	}
	
	public static void addProduct(){
		System.out.println("Enter product name to add: ");
		String addProduct=sc.nextLine();
		System.out.println("Enter price: ");
		String addPrice=sc.nextLine();
		products.put(addProduct, Integer.valueOf(addPrice));

		System.out.println("Product Added: "+ addProduct);

	}
	
	public static void displayProducts(){
		System.out.println("All Products:");
		for (Map.Entry<String, Integer> entry : products.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}	
	
		System.out.println("Total products: "+ products.size());
	}
	
	public static void findCheapestProduct(){
		Integer lowestValue =0;
		String cheapestProduct="";
		for (Map.Entry<String, Integer> entry : products.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
			if (lowestValue == 0)
			lowestValue =entry.getValue();
			else {
				if (lowestValue > entry.getValue()) {
					lowestValue = entry.getValue();
					cheapestProduct = entry.getKey();
				}
				
			}
		}	

		System.out.println("Cheapest product: "+ cheapestProduct + " - " + lowestValue);
	}
}
