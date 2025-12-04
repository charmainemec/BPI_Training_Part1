package ph.com.bpi.hello;

public class Car {
	String model;
	int year;
	String color;
	
	
	public Car() {
	}
	
	public Car(String model, int year, String color) {
		this.model = model;
		this.year = year;
		this.color = color;
	}
    public void setModel(String model) {
    	this.model = model;
    }
    
    public String getModel() {
    	return this.model;
    	   	
    }
    public void setYear(int year) {
    	this.year = year;
    }
    
    public int getYear() {
    	return this.year;
    	   	
    }
    
    public void setColor(String color) {
    	this.color = color;
    }
    
    public String getColor() {
    	return this.color;
    	   	
    }
    
    public void displayDetails() {
    	
        System.out.println("Car #1 - Model:" + this.model + " Color:" 
        	       + this.color + " Year: " + this.year  		   );
    }
}
