package m2.activity6;

public class Car extends Vehicle implements Refuelable {

    
	public Car(String brand) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.noOfWheels=4;
		System.out.println("This is a "+ this.brand + " with "+ this.noOfWheels + " wheels");
	}

	public void refuel() {
   	 System.out.println("Refueling the " + this.brand + " vehicle");
   	 
    }
}
