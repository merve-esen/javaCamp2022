package day3.kodlamaio.src.business;

import java.util.List;

import day3.kodlamaio.src.core.logging.Logger;
import day3.kodlamaio.src.dataAccess.CourseDao;
import day3.kodlamaio.src.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Logger> loggers;

	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) {
		if (this.courseDao.existsByName(course.getName())){
			System.out.println("Bu isimde bir kayıt bulunmaktadır.");
			return;
		}

		if (course.getPrice() < 0){
			System.out.println("Kurs fiyatı 0'dan küçük olamaz.");
			return;
		}

		this.courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log("Kurs eklendi - " + course.getName());
		}
	}
}
