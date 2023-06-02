package Pojo;



public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String course;
	private int per;

	Course co;
	

	public Student(int id, String name, String course, int per,Course co) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.per = per;
		this.co=co;
	}

	public Course setCo() {
		return co;
	}
	
	public void getCo() {
		this.co=co;
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
		return "Student [id=" + id + ", name=" + name + ", course="+co + ", per=" + per + "]";
	}

	@Override
	public int compareTo(Student o) {

		return this.getId() - o.getId();
	}

}
