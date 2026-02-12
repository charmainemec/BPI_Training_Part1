package m6_activity3;
import util.EntityManagerUtil;
import jakarta.persistence.EntityManager;
import model.Course;
import model.Student;

public class App {
	
	public static void main(String[] args) {
		EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

		try {
			persistOneToMany(em);
		} finally {
			EntityManagerUtil.getInstance().closeEntityManager(em);
			EntityManagerUtil.getInstance().shutdownFactory();
		}
	}

		static void persistOneToMany(EntityManager em) {
			em.getTransaction().begin();
			
			Student student1 = em.find(Student.class, 1L);
			
			Course newCourse = new Course();
			newCourse.setCourseName("Math");
			newCourse.setGrade("75");
			newCourse.setStudent(student1);
			
			em.persist(newCourse);
			//em.getTransaction().commit();
			
			Course newCourse2 = new Course();
			newCourse2.setCourseName("English");
			newCourse2.setGrade("70");
			newCourse2.setStudent(student1);
			
			em.persist(newCourse2);
			em.getTransaction().commit();
		}



	}


