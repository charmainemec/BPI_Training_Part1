package m2.activity6;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vehicle car1 = new Car("Toyota");         
         car1.startEngine();
         car1.refuel();
         Vehicle truck1 = new Truck("Truck", 8);
         truck1.startEngine();
         truck1.refuel();
         destroyVehicle(car1);
         destroyVehicle(truck1);
	}
	
	private static void destroyVehicle(Vehicle vehicle) {
		vehicle.destroy();
	}
         

}
