package Pojo;

public class Course {

	String name;
	String course;
	public Course(String name, String course) {
		super();
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", course=" + course + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	
}
