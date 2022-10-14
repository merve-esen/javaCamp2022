package day3.kodlamaio.src.dataAccess;

import day3.kodlamaio.src.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}

}
