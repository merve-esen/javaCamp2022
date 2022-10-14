package day3.kodlamaio.src.business;

import day3.kodlamaio.src.dataAccess.InstructorDao;
import day3.kodlamaio.src.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;

	public InstructorManager(InstructorDao instructorDao) {
		this.instructorDao = instructorDao;
	}

	public void add(Instructor instructor) {
		this.instructorDao.add(instructor);
	}
}