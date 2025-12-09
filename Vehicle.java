package m2.activity6;

public abstract class Vehicle {
   String brand ="";
   int noOfWheels = 0;
   

   void startEngine() {
	   System.out.println("Starting the " + brand + "'s engine");
   }
   void destroy() {
	   System.out.println("Destroying the " + brand + " vehicle");
   }
   public void setNoOfWheels(int noOfWheels) {
	   this.noOfWheels=noOfWheels;
	   
   }
   public void setBrand(String brand) {
	   
	   this.brand=brand;
   }
   
   public int getNoOfWheels() {
	   return this.noOfWheels;
	   
   }
   public String getBrand() {
	   
	   return this.brand;
   }
   protected abstract void refuel();
}
