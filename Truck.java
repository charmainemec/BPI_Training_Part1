package m2.activity6;

public class Truck extends Vehicle implements Refuelable{

     
 	public Truck(String brand, int noOfWheels) {
		this.brand=brand;
		this.noOfWheels=noOfWheels;
		
		System.out.println("This is a "+ this.brand + " with "+ this.noOfWheels + " wheels");
	}
 	
    public void refuel() {
   	 System.out.println("Refueling the " + this.brand + " vehicle");
   	 
    }
}
