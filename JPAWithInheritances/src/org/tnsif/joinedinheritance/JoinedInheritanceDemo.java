package org.tnsif.joinedinheritance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one emp1
		Employee e=new Employee();
		e.setId(1);
		e.setName("Lohith");
		e.setSalary(20000.37);
		em.persist(e);
		
		//create second emp2
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("Lokesh");
		e1.setSalary(25000.34);
		em.persist(e1);
		
		//create one manager
		Manager m=new Manager();
		m.setId(3);
		m.setDeptname("IT");
		m.setName("Rajesh");
		m.setSalary(67000.39);
		em.persist(m);
		em.getTransaction().commit();
		System.out.println("Data is added in the database");
		em.close();
		factory.close();

		
	}

}
