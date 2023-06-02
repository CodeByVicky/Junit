package Deo;

import java.util.*;
import java.util.Map.Entry;

import Pojo.Student;

public class Student_Imp implements StudentCrud {
	ArrayList<Student> list = new ArrayList<>();
	HashMap<String, ArrayList<String>> lcourse = new HashMap();
	ArrayList<String> li = new ArrayList<>();

	@Override
	public void add(Student s) throws Exception {

		Scanner can = new Scanner(System.in);

		System.out.println("which number of student Add");
		int size = can.nextInt();
		boolean find = false;

		if (size > 0 || size <= 9) {
			for (int i = 0; i < size; i++) {
				Student stu = new Student(i, null, null, i, null);

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

				System.out.println("Enter Number of Student Course");
				int num = can.nextInt();

				String s11 = "";

				if (num > 0 || num <= 9) {

					for (int i1 = 0; i1 < num; i1++) {
						System.out.println("Enter Student Course");
						s11 = can.next();

					}
					stu.setCourse(s11);
					li.add(s11);

					lcourse.put(s1, li);

				} else {
					throw new Exception();
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
	public void display(Student s) {

		if (list.size() != 0) {

			Scanner can = new Scanner(System.in);
			System.out.println("..........................................");
			for (Student stu : list) {

				System.out.println("Id:" + stu.getId() + " " + "Name:" + stu.getName() + " " + "Course:"
						+ stu.getCourse() + " " + "Percentage:" + stu.getPer());
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

				Collections.sort(list, new Asen_Comparator());

				for (Student stu : list) {

					System.out.println("Id:" + stu.getId() + " " + "Name:" + stu.getName() + " " + "Course:"
							+ stu.getCourse() + " " + "Percentage:" + stu.getPer());
				}
				System.out.println("...........................................");
				break;

			default:
				break;
			}

		} else {
			System.out.println("No any information present in Data\nPlease Add Student....! ");
		}

	}

	@Override
	public void remove(Student s) throws Exception {

		if (list.size() != 0) {

			Scanner can = new Scanner(System.in);
			boolean flag = false;

			do {
				System.out.println("Enter Remove Student Id");
				int find = can.nextInt();
				flag = false;

				Iterator<Student> itr = list.iterator();
				if (find > 0 || find <= 9) {

					while (itr.hasNext()) {
						Student s1 = itr.next();

						if (s1.getId() == find) {
							itr.remove();
							System.out.println("Delete Sucessful.............");
							flag = true;

						}

					}
					if (flag == false)
						System.out.println("Somthing wrong............");

				} else {
					throw new Exception();
				}

			} while (flag == false);

		} else {
			System.out.println("No any information present in Data\nPlease Add Student....! ");
		}

	}

	@Override
	public void search(Student s) throws Exception {

		if (list.size() != 0) {

			Scanner can = new Scanner(System.in);

			boolean find = false;

			do {
				find = false;
				System.out.println("Enter Student Name");
				String name = can.nextLine();

				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getName().endsWith(name)) {
						System.out.println("Id:" + list.get(j).getId() + " " + "Name:" + list.get(j).getName() + " "
								+ "Course:" + list.get(j).getCourse() + " " + "Percentage:" + list.get(j).getPer());

						find = true;
					}

				}

				if (find == false) {
					System.out.println("Somthing wrong.............");

					System.out.println("1-Search By Id\n2-Exit");
					int find1 = can.nextInt();

					switch (find1) {
					case 1:
						do {
							find = false;
							System.out.println("Enter Student Id");
							int id = can.nextInt();

							if (id > 0 || id <= 9) {
								for (int j = 0; j < list.size(); j++) {
									if (list.get(j).getId() == id) {
										System.out.println("Id:" + list.get(j).getId() + " " + "Name:"
												+ list.get(j).getName() + " " + "Course:" + list.get(j).getCourse()
												+ " " + "Percentage:" + list.get(j).getPer());

										find = true;
									}

								}

								if (find == false)
									System.out.println("Somthing wrong.............");

							} else {
								throw new Exception();
							}

						} while (find == false);

						break;

					case 2:
						break;

					default:
						System.out.println("Somthing wrong............\nPlease Enter Correct Option");
					}

				}

			} while (find == false);

			System.out.println(".......................................");

		} else {
			System.out.println("No any information present in Data\nPlease Add Student....! ");
		}
	}

	@Override
	public void displayCourse(Student s) {

		if (list.size() != 0) {

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
		} else {
			System.out.println("No any information present in Data\nPlease Add Student....! ");
		}
	}

	@Override
	public void update(Student s) throws Exception {

		if (list.size() != 0) {

			System.out.println("1-Update Student Information\n2-Exit");
			Scanner can = new Scanner(System.in);
			int find1 = can.nextInt();

			switch (find1) {
			case 1:
				boolean flag = false;

				do {
					System.out.println("Enter Which Student Information to Update\nPlease Enter This Student Id");
					int find = can.nextInt();
					flag = false;

					Iterator<Student> itr = list.iterator();
					if (find > 0 || find <= 9) {

						while (itr.hasNext()) {
							Student s1 = itr.next();

							if (s1.getId() == find) {
								System.out.println("ID Successfully Match........");
								itr.remove();

								flag = true;

							}

						}
						if (flag == false)
							System.out.println("Somthing wrong............");

					} else {
						throw new Exception();
					}

				} while (flag == false);

				boolean find = false;

				for (int i = 0; i < 1; i++) {
					Student stu = new Student(i, null, null, i, null);

					do {
						find = false;
						System.out.println("Enter New Student Id");
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

					System.out.println("Enter New Student Name");
					String s1 = can.next();

					for (int i1 = 0; i1 < s1.length(); i1++) {

						if ((s1.charAt(i1) >= 'a' && s1.charAt(i1) <= 'z')) {
							stu.setName(s1);
						} else {
							throw new Exception();
						}

					}
					System.out.println("Enter Number of Student Course");
					int num = can.nextInt();

					String s11 = "";

					if (num > 0 || num <= 9) {

						for (int i1 = 0; i1 < num; i1++) {
							System.out.println("Enter Student Course");
							s11 = can.next();

						}
						stu.setCourse(s11);
						li.add(s11);

						lcourse.put(s1, li);

					} else {
						throw new Exception();
					}

					System.out.println("Enter New Student Persentage");

					int per = can.nextInt();

					if (per > 0 || per <= 9) {
						stu.setPer(per);

					} else {
						throw new Exception();
					}
					list.add(stu);
				}

				System.out.println("Information Add Sucessful......");
				break;

			case 2:
				break;

			default:
				System.out.println("Enter Correct Chiose");
				System.out.println("..........................");

			}

		} else {
			System.out.println("No any information present in Data\nPlease Add Student....! ");
		}
	}

}