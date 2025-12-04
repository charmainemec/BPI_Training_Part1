package ph.com.bpi.hello;

public class Seatwork1 {
	public static void main(String[] args) {
		House house1 = new House();
		house1.window(3);
		Tree tree1 = new Tree();
		 System.out.println("The Tree has " + String.valueOf(tree1.leave) + " leaves");
		 
		 Book book1 = new Book(5);
		 book1.displayPages();
	}
}
