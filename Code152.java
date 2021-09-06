package JustRunJava;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Person3{
	private String name;
	private int score;
	
	Person3(String name, int score) {
	this.name = name;
	this.score = score;
}
	public String toString() {
		return "("+name+" , "+score+")";
	}
}
public class Code152 {
	public static void main(String[] args) {
		TreeMap<Integer, Person3> map = new TreeMap<>();
		map.put(3, new Person3("David", 80));
		map.put(1, new Person3("Bob", 90));
		map.put(2, new Person3("Alice", 80));
		map.put(5, new Person3("Cindy", 77));
		map.put(4, new Person3("Jenny", 93));
		   
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		System.out.println("=============================");
		
		for(Map.Entry<Integer, Person3> e:map.entrySet()) {
			Integer key = e.getKey();
			Person3 value = e.getValue();
			System.out.println(key + " : "+value);
		}
		System.out.println("------------------------------");
		Person3 val = (Person3)map.get(3);
		System.out.print("key 3 > ");
		System.out.println(val);
	}

}
