package Test;

import java.util.*;

import Deo.Student_Imp;
import Deo.myException;
import Deo.StudentCrud;
import Pojo.Student;


public class Student_Test {

	public static void show(Student_Imp stu1) throws Exception {
		
		Student_Imp stu = stu1;
		Scanner can = new Scanner(System.in);

		

		System.out.println(
				"1-Add Student \n2-Remove a Student \n3-Search for a Student by Name \n4-Display a list of all Student \n5-Display a list of Student by Course");

		int find = can.nextInt();

		if (find > 0 || find <= 9) {

			switch (find) {

			case 1:
				try {
					stu.Add(null);
				} catch (Exception e) {
					System.out.println("Somthing Wrong....\nPlease Enter Correct Information");
				}

				System.out.println("..........................");
				break;

			case 2:
				try {
					stu.Remove(null);
				} catch (Exception e) {
					System.out.println("Somthing Wrong....\nPlease Enter Correct Information");
				}

				System.out.println("..........................");
				break;

			case 3:
				try {
					stu.Search(null);
				} catch (Exception e) {
					System.out.println("Somthing Wrong....\nPlease Enter Correct Information");
				}

				System.out.println("..........................");
				break;

			case 4:
				stu.Display(null);
				System.out.println("..........................");
				break;

			case 5:
				stu.DisplayCourse(null);
				System.out.println("..........................");
				break;

			default:
				System.out.println("Enter Correct Chiose");
				System.out.println("..........................");

			}

		} else {
			throw new Exception();
		}

	}

	public static void main(String[] args) {
		Student_Imp stu1 = new Student_Imp();
		Scanner can = new Scanner(System.in);
		String s = "";
		
		System.out.println("....WELLCOME....\nStudent Management System");
		System.out.println("............................................................");

		System.out.println("Please Enter Student Information");
		try {
			stu1.Add(null);
		} catch (Exception e) {
			System.out.println("Somthing Wrong....\nPlease Enter Correct Information");
		}

		System.out.println("..........................");
		
		do {
			try {
				Student_Test.show(stu1);
			} catch (Exception e) {
				System.out.println("Somthing Wrong....\nPlease Enter Correct Information");
			}

			System.out.println("Do You Want Same Opration \nYes-Press 'yes' No-Press Any Key ");
			s = can.next();
			System.out.println("..........................");
		} while ("yes".equals(s));

	}

}
