package JustRunJava;
	//Iterator
	//LinkedList는 for문을 통해 출력하는것 보다, Iterator을 사용하는 것이 버그를 줄일 수 있다.
import java.util.Iterator;
import java.util.LinkedList;

public class Code143 {
public static void main(String[] args) {
	LinkedList<String> llTest = new LinkedList<String>();
	llTest.add("First");
	llTest.add("Sceond");
	llTest.add("Third");
	llTest.add("첫번째");
	llTest.add("두번째");
	llTest.add("세번째");
	
	System.out.println("-----------for-----------");
	
	for(String s : llTest) {
		System.out.println(s);
	}
	
	System.out.println("-----------Iterator-----------");
	
	Iterator<String> iter = llTest.iterator();
	while (iter.hasNext()) {
		String t = iter.next();
		System.out.println(t);
	}
	
	
}
}
