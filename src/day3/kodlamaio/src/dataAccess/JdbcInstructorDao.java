package day3.kodlamaio.src.dataAccess;

import day3.kodlamaio.src.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}

}
