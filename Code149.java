package JustRunJava;

import java.util.Comparator;
import java.util.TreeSet;

class Person2{
	private int id;
	private int score;
	Person2(){}
	Person2(int id, int score) {
		this.id = id;
		this.score = score;
	}
	int getId() {
		return id;
	}
	public String toString() {
		return  "[id : "+id+" , score : "+score+" ]";
	}
}

class PersonComparator implements Comparator<Person2>{
	public int compare (Person2 o1, Person2 o2) {
		return o1.getId() - o2.getId();
	}
}

public class Code149 {
	public static void main(String[] args) {
		TreeSet<Person2> ts = new TreeSet<>();
		ts.add(new Person2(3, 83));
		ts.add(new Person2(5, 50));
		ts.add(new Person2(1, 12));
		ts.add(new Person2(2, 55));
		ts.add(new Person2(4, 50));
		for(Person2 p:ts) {
			System.out.println(p);
		}
	}

}
