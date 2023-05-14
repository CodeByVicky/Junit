package Deo;

import java.util.*;
import java.util.Map.Entry;

import Pojo.Student;

public class Student_Imp implements StudentCrud {
	ArrayList<Student> list = new ArrayList<>();

	@Override
	public void Add(Student s) throws Exception {

		Scanner can = new Scanner(System.in);

		System.out.println("which number of student Add");
		int size = can.nextInt();
		boolean find = false;

		if (size > 0 || size <= 9) {
			for (int i = 0; i < size; i++) {
				Student stu = new Student(i, null, null, i);

				do {
					find = false;
					System.out.println("Enter Student Id");
					int id = can.nextInt();

					if (id > 0 || id <= 9) {
						for (int j = 0; j < list.size(); j++) {
							if (list.get(j).getId() == id) {
								System.out.println("id is present enter unique id");
								find = true;
							}

						}

						if (find == false)
							stu.setId(id);

					} else {
						throw new Exception();
					}

				} while (find == true);

				System.out.println("Enter Student Name");
				String s1 = can.next();

				for (int i1 = 0; i1 < s1.length(); i1++) {

					if ((s1.charAt(i1) >= 'a' && s1.charAt(i1) <= 'z')) {
						stu.setName(s1);
					} else {
						throw new Exception();
					}

				}

				System.out.println("Enter Student Course");
				String s11 = can.next();

				for (int i1 = 0; i1 < s11.length(); i1++) {

					if ((s11.charAt(i1) >= 'a' && s11.charAt(i1) <= 'z') || s11.charAt(i1) == '+') {
						stu.setCourse(s11);
					} else {
						throw new Exception();
					}

				}

				System.out.println("Enter Student Persentage");

				int per = can.nextInt();

				if (per > 0 || per <= 9) {
					stu.setPer(per);

				} else {
					throw new Exception();
				}
				list.add(stu);
			}

		} else {
			throw new Exception();
		}

		System.out.println("Information Add Sucessful......");

	}

	@Override
	public void Display(Student s) {
		Scanner can = new Scanner(System.in);
		System.out.println("..........................................");
		for (Student stu : list) {

			System.out.println("Id:" + stu.getId() + " " + "Name:" + stu.getName() + " " + "Course:" + stu.getCourse()
					+ " " + "Percentage:" + stu.getPer());
		}
		System.out.println(".......................................");
		System.out.println("Enter Display Type\n1-Anscending\n2-Descending\n3-Exit for Any Key");
		int dis = can.nextInt();

		switch (dis) {
		case 1:
			Collections.sort(list);
			for (Student stu : list) {

				System.out.println("Id:" + stu.getId() + " " + "Name:" + stu.getName() + " " + "Course:"
						+ stu.getCourse() + " " + "Percentage:" + stu.getPer());
			}
			System.out.println("...........................................");
			break;

		case 2:

			Collections.sort(list, new Asen());

			for (Student stu : list) {

				System.out.println("Id:" + stu.getId() + " " + "Name:" + stu.getName() + " " + "Course:"
						+ stu.getCourse() + " " + "Percentage:" + stu.getPer());
			}
			System.out.println("...........................................");
			break;

		default:
			break;
		}

	}

	@Override
	public void Remove(Student s) throws Exception {
		Iterator<Student> itr = list.iterator();

		Scanner can = new Scanner(System.in);
		System.out.println("Enter Remove Student Id");
		int find = can.nextInt();
		boolean flag=false;

		if (find > 0 || find <= 9) {

			while (itr.hasNext()) {
				Student s1 = itr.next();

				if (s1.getId() == find) {
					itr.remove();
					System.out.println("Delete Sucessful.............");
					flag=true;
					break;
				} 
				
				if(flag==false)
					System.out.println("Somthing wrong.............\nPlease Enter Correct Id");

			}

		} else {
			throw new Exception();
		}

	}

	@Override
	public void Search(Student s) throws Exception {

		Scanner can = new Scanner(System.in);

		boolean find = false;

		do {
			find = false;
			System.out.println("Enter Student Id");
			int id = can.nextInt();

			if (id > 0 || id <= 9) {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getId() == id) {
						System.out.println("Id:"+list.get(j).getId()+" "+"Name:"+list.get(j).getName()+" "+"Course:"+list.get(j).getCourse()+" "+"Percentage:"+list.get(j).getPer());

						find = true;
					}

				}

				if (find == false)
					System.out.println("Somthing wrong.............\nPlease Enter Correct Id");

			} else {
				throw new Exception();
			}

		} while (find == false);

	}
	


	@Override
	public void DisplayCourse(Student s) {

		HashMap<String, ArrayList<String>> map = new HashMap();

		Iterator<Student> itr = list.iterator();
		while (itr.hasNext()) {
			Student stu = itr.next();
			String st = stu.getCourse();

			if (map.containsKey(st)) {
				ArrayList<String> al = map.get(st);
				al.add(stu.getName());
				map.put(st, al);
			} else {
				ArrayList<String> al = new ArrayList<String>();
				al.add(stu.getName());
				map.put(st, al);
			}
		}

		Iterator<Map.Entry<String, ArrayList<String>>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, ArrayList<String>> e = it.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
