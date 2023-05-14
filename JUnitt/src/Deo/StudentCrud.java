package Deo;
import Pojo.Student;

public interface StudentCrud {

	void Add(Student s) throws Exception;
	void Display(Student s);
	void Remove(Student s)throws Exception;
	void Search(Student s)throws Exception;
	void DisplayCourse(Student s);
}
