package JustRunJava;
import java.util.ArrayList;
import java.util.ListIterator;

public class Code146 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		//ListIterator<String> li = al.listIterator();	
		//�� �κп� Iterator ��ü�� �����ϰ� �Ǹ�, ConcurrentModificationException ���ܰ� �߻��Ѵ�.
		//Iterator�� �ڷᰡ ä������ ������ ����������(�������� �ޱ� ������)
		
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
