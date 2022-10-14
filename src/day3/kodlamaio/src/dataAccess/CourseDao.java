package day3.kodlamaio.src.dataAccess;

import day3.kodlamaio.src.entities.Course;

public interface CourseDao {
	void add(Course course);
	boolean existsByName(String name);
}