package FInal;

import java.util.*;

class Team {
	int id;
	String name;

	public Team(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}

	public int hashCode() {
		return name.hashCode();

	}

	public boolean equals(Object o) {

		Team t = (Team) o;
		if (this.name.equals(t.name)) {
			return true;
		}

		return false;
	}
}

public class Demo2 {

	public static void main(String[] args) {

		Map<Team, Integer> map = new HashMap<>();
		Scanner can = new Scanner(System.in);

		map.put(new Team(1, "vicky"), 97);
		map.put(new Team(2, "pratik"), 87);
		map.put(new Team(3, "mahesh"), 44);
		map.put(new Team(4, "ram"), 67);

		for (Map.Entry<Team, Integer> itr : map.entrySet()) {
			System.out.println(itr.getKey() + " " + itr.getValue());
		}

		System.out.println("--------------------------------");
		System.out.println("enter name");
		String nameT = can.next();
//		for(Map.Entry<Team, Integer>itr:map.entrySet()) {
//			if(itr.getKey().name.endsWith(nameT)) {
//				System.out.println(itr.getValue());
//			}
//			
//			
//		}

		Team team = new Team(0, nameT);

		System.out.println(map.get(team));

	}

}
