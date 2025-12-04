package ph.com.bpi.hello;

public class Book {
	int page =0;
	public Book(int num) {
	this.page= num;
	}
	
	public void displayPages()
	{
		System.out.println("The Book has " + String.valueOf(page) + " pages");
		
	}
}
