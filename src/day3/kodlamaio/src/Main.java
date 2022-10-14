package day3.kodlamaio.src;

import java.util.ArrayList;
import java.util.List;

import day3.kodlamaio.src.business.CategoryManager;
import day3.kodlamaio.src.business.CourseManager;
import day3.kodlamaio.src.business.InstructorManager;
import day3.kodlamaio.src.core.logging.DatabaseLogger;
import day3.kodlamaio.src.core.logging.FileLogger;
import day3.kodlamaio.src.core.logging.Logger;
import day3.kodlamaio.src.core.logging.MailLogger;
import day3.kodlamaio.src.dataAccess.HibernateCourseDao;
import day3.kodlamaio.src.dataAccess.JdbcCategoryDao;
import day3.kodlamaio.src.dataAccess.JdbcInstructorDao;
import day3.kodlamaio.src.entities.Category;
import day3.kodlamaio.src.entities.Course;
import day3.kodlamaio.src.entities.Instructor;

public class Main {

	public static void main(String[] args) {
		Category category = new Category(1, "Programlama");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao());
		categoryManager.add(category);

		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao());
		instructorManager.add(instructor);

		Course course = new Course(1, 1, 1, "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", 23000);
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());
		loggers.add(new MailLogger());
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
	}

}
