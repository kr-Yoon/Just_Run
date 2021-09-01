package JustRunJava;
	//공부할것
import java.util.Iterator;
import java.util.TreeSet;

class Person7 implements Comparable<Person7>{
	private int id;
	private int score;
	Person7() {}
	Person7(int id, int score) {
		this.id = id;
		this.score = score;
	}
	public String toString() {
		return "[id : "+id+" , score : "+score+" ]";
	}
	@Override
	public int compareTo(Person7 p) {
		return this.id - p.id;
	}
}
public class Code148 {
	public static void main(String[] args) {
		TreeSet<Person7> ts = new TreeSet<Person7>();
		ts.add(new Person7(3, 83));
		ts.add(new Person7(5, 50));
		ts.add(new Person7(1, 12));
		ts.add(new Person7(2, 55));
		ts.add(new Person7(4, 50));
		
		Iterator<Person7> iter = ts.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
