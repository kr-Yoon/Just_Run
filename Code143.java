package JustRunJava;
	//Iterator
	//LinkedList�� for���� ���� ����ϴ°� ����, Iterator�� ����ϴ� ���� ���׸� ���� �� �ִ�.
import java.util.Iterator;
import java.util.LinkedList;

public class Code143 {
public static void main(String[] args) {
	LinkedList<String> llTest = new LinkedList<String>();
	llTest.add("First");
	llTest.add("Sceond");
	llTest.add("Third");
	llTest.add("ù��°");
	llTest.add("�ι�°");
	llTest.add("����°");
	
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
