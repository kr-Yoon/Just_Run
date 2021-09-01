package JustRunJava;
import java.util.ArrayList;
import java.util.ListIterator;

public class Code146 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		//ListIterator<String> li = al.listIterator();	
		//이 부분에 Iterator 객체를 생성하게 되면, ConcurrentModificationException 예외가 발생한다.
		//Iterator은 자료가 채워져야 지정이 가능해진다(참조값을 받기 때문에)
		
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		
		
		ListIterator<String> li = al.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next());
		}
		
		System.out.println();
		
		while(li.hasPrevious()) {
			System.out.print(li.previous());
		}
	}
}
