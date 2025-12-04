package ph.com.bpi.hello;

public class M2_Activity3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   //instantiate car1
       Car car1 = new Car();
       //call set Methods
       car1.setModel("BYD");
       car1.setYear(2025);
       car1.setColor("blue");
       
       //instantiate car2
       Car car2 = new Car("Honda", 2024, "red");

       //call method
       car1.displayDetails();
       
       //call get methods
       System.out.println("Car #2 - Model:" + car2.getModel() + " Color:" 
       + car2.getColor() + " Year: " + car2.getYear()   		   );
	}
}
