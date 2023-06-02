package Deo;
import Pojo.Student;

public interface StudentCrud {

	void add(Student s) throws Exception;
	void display(Student s);
	void remove(Student s)throws Exception;
	void search(Student s)throws Exception;
	void displayCourse(Student s);

	void update(Student s)throws Exception;
}
