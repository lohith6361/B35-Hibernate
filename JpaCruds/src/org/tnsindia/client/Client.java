package org.tnsindia.client;

import org.tnsindia.entities.Student;
import org.tnsindia.service.StudentService;
import org.tnsindia.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
	
		StudentService service=new StudentServiceImpl();
		
		Student student=new Student();
		
		//creation
		
		student.setRollNo(1212);
		student.setName("Sudeep");
		service.create(student);
		
		System.out.println("The data is inserted");
		
		
		
		//Retrieve
		/*student=service.retrieve(1214);
		System.out.println("ROLL NO: "+student.getRollNo()+" "+"Name: "+
		student.getName());*/
		
		
		//update
	/*student=service.retrieve(1214);
		student.setName("Puneeth Rajkumar");
		service.update(student);
		System.out.println("The data is updated");*/
		
		//delete
		/*student=service.retrieve(122);
		service.delete(student);
		System.out.println("The data is deleted");*/



		

	}

}
