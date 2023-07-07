package OneXTel;
import java.util.*;

public class SortMapBYValue {

	public static void main(String[] args) {
		//Creating a map (fruit name -> key, price -> value)
		Map<String, Integer> hashmap = new HashMap<>();
			
		//Inserting elements
		hashmap.put("Avocado", 80);
		hashmap.put("Honeydew", 60);
		hashmap.put("Blueberries", 45);
		hashmap.put("Cranberries", 60);
		hashmap.put("Mango", 75);
			
		//Using forEach loop to print the elements
		//Before sorting
		System.out.println("The original array before sorting:");
		hashmap.forEach((key,value)->System.out.println(key + " -> " + value));
			
		//After sorting	
		System.out.println("\nAfter sorting by their prices:");
			
		//Creating a list of the original hashmap in order to sort
		//the elements with sort() method
		List<Map.Entry<String, Integer>> list = new ArrayList<>(hashmap.entrySet());
			
		//Using Entry's comparingByValue() method for sorting in ascending order
		list.sort(Map.Entry.comparingByValue());
			
		//Printing the elements from the list
		list.forEach((fruit)->System.out.println(fruit.getKey() + " -> " + fruit.getValue()));
		}
	}



