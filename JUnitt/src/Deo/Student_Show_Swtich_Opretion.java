package Deo;

import java.util.Scanner;

public class Student_Show_Swtich_Opretion {

	public static void show(Student_Imp stu1) throws Exception {

		Student_Imp stu = stu1;
		Scanner can = new Scanner(System.in);

		System.out.println(
				"1-Add Student Information \n2-Remove Student Information\n3-Search Student by Name \n4-Display list of All Student \n5-Display list of Student by Course\n6-Display Course By Name\n7-Update Student Information\n8-Exit");

		int find = can.nextInt();

		if (find > 0 || find <= 9) {

			switch (find) {

			case 1:
				try {
					stu.add(null);
				} catch (Exception e) {
					System.out.println("Somthing Wrong....\nPlease Enter Correct Information");
				}

				System.out.println("..........................");
				break;

			case 2:
				try {
					stu.remove(null);
				} catch (Exception e) {
					System.out.println("Somthing Wrong....\nPlease Enter Correct Information");
				}

				System.out.println("..........................");
				break;

			case 3:
				try {
					stu.search(null);
				} catch (Exception e) {
					System.out.println("Somthing Wrong....\nPlease Enter Correct Information");
				}

				System.out.println("..........................");
				break;

			case 4:
				stu.display(null);
				System.out.println("..........................");
				break;

			case 5:
				stu.displayCourse(null);
				System.out.println("..........................");
				break;

			case 7:
				stu.update(null);

				System.out.println("..........................");
				break;
				
			case 6:
				
				System.out.println("..........................");
				break;
				
			case 8:break;

			default:
				System.out.println("Enter Correct Chiose");
				System.out.println("..........................");

			}

		} else {
			throw new Exception();
		}

	}

}
