package m5_activity3;

//import java.sql.Connection;

import java.sql.SQLException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class M5_Activity3 {

	private static final Logger logger = LoggerFactory.getLogger(M5_Activity3.class);
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int option;
		StudentDAO stud = new StudentDAO();
		CourseDAO course = new CourseDAO();
		
		
		do {
			System.out.println("==== STUDENT COURSE MANAGEMENT =====");
			System.out.println("1 - Add Student");
			System.out.println("2 - Add Course");
			System.out.println("3 - Show Students");
			System.out.println("4 - Show Courses");
			System.out.println("0 - Exit");

			System.out.print("Enter Choice:");

			option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1:
				stud.addStudent(sc);
				break;
			case 2:
				course.addCourse(sc);
				break;
			case 3:
				stud.showStudent();
				break;
			case 4:
				course.showCourse();
				break;
			case 0:
				logger.info("Exiting application.");
				System.exit(0);
			default:
				logger.info("Invalid option! Please try again.\n");
			}
		} while (option != 'D');
		sc.close();
		
	}

}