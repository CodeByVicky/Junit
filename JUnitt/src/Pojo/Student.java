package Pojo;

public class Student implements Comparable <Student>{
	private int id;
	private String name;
	private String course;
	private int per;

	public Student(int id, String name, String course, int per) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.per = per;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public int getPer() {
		return per;
	}


	public void setPer(int per) {
		this.per = per;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", per=" + per + "]";
	}


	@Override
	public int compareTo(Student o) {
		
		return this.getId()-o.getId();
	}


	
}
