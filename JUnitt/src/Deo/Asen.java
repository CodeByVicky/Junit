package Deo;

import java.util.Comparator;

import Pojo.Student;

public class Asen implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getId()-o1.getId();
	}

}
