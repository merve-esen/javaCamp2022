package day3.kodlamaio.src.entities;

public class Course {
	private int id;
	private int courseId;
	private int instructorId;
	private String name;
	private double price;

	public Course(int id, int courseId, int instructorId, String name, double price) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.instructorId = instructorId;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
