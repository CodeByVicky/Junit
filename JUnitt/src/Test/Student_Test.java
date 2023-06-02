package Test;

import java.util.*;
import Deo.Student_Imp;
import Deo.Student_Show_Swtich_Opretion;

public class Student_Test {

	public static void main(String[] args) {
		Student_Imp stu1 = new Student_Imp();
		Scanner can = new Scanner(System.in);

		String s = "";

		System.out.println("....WELLCOME....\nStudent Management System");
		System.out.println("............................................................");

		do {
			try {
				Student_Show_Swtich_Opretion.show(stu1);
			} catch (Exception e) {
				System.out.println("Somthing Wrong....\nPlease Enter Correct Information");
			}

			System.out.println("Do You Want Same Opration \nYes-Press 'yes' No-Press Any Key ");
			s = can.nextLine();
			System.out.println("..........................");
		} while ("yes".equals("yes"));

	}

}
