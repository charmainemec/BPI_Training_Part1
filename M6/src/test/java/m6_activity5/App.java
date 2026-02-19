package m6_activity5;
import util.EntityManagerUtil;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import model.Course;
import model.Student;

public class App {
	
	public static void main(String[] args) {
		EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

		try {
			findStudentNames(em);
			System.out.println("");
			countCoursesByStudentId(em, 21L);
			System.out.println("");
			findStudentsByAgeGreaterThan(em, 20);
		} finally {
			EntityManagerUtil.getInstance().closeEntityManager(em);
			EntityManagerUtil.getInstance().shutdownFactory();
		}
	}
	//countCoursesByStudentId(Long id);
	static void countCoursesByStudentId(EntityManager em, Long id) {
		
		em.getTransaction().begin();
		
		System.out.println("Course count with student_id " +id+ ": " + em.createQuery("SELECT COUNT(c) FROM Course c JOIN c.student s WHERE s.id = :id", Long.class)
				.setParameter("id", id).getSingleResult());
		em.getTransaction().commit();
		
	}

	
	//findStudentNames()
	static void findStudentNames(EntityManager em) {
		
		em.getTransaction().begin();
		
		String jpql = "Select s FROM Student s";
		TypedQuery<Student> query = em.createQuery(jpql, Student.class);
		List<Student> students = query.getResultList();
		
		//print student names
		students.forEach(student -> System.out.println("Name: "+ student.getName() +
				" Student_id: "+ student.getId() +
				" Age: " + student.getAge()));
		
		em.getTransaction().commit();
		
	}
	
	//findStudentsByAgeGreaterThan(int age);
	static void findStudentsByAgeGreaterThan(EntityManager em, int age) {
		
		em.getTransaction().begin();
		
		String jpql = "Select s FROM Student s WHERE age > ?1";
		TypedQuery<Student> query = em.createQuery(jpql, Student.class);
		//query.setParameter(1, name);
		query.setParameter(1, age);
		List<Student> students = query.getResultList();
		
		System.out.println("Students with age > " + age);
		//print student names
		students.forEach(student -> System.out.println(student.getName()));
		
		em.getTransaction().commit();
		
	}



	}


