package day3.kodlamaio.src.dataAccess;

import day3.kodlamaio.src.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile eklendi: " + course.getName());
	}

	@Override
	public boolean existsByName(String name) {
		return false;
	}

}
