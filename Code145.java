package JustRunJava;
	//Queue�� �������̽��̱� ������ �����ڰ� ����, Queue�� �����Ϸ��� ���� Ŭ������ ����ؾ��Ѵ� LinkedList�� �̿�.
	//Stack�� ���� ���� �������, Queue�� �ո� ���� �����̴�.
import java.util.LinkedList;
import java.util.Queue;

public class Code145 {

	public static void main(String[] args) {
		Queue<Integer> qTest = new LinkedList<Integer>();
		qTest.add(10);
		qTest.add(20);
		qTest.add(30);
		
		int data;
		data = qTest.poll();
		qTest.add(40);
		System.out.println(data);
		
		
		while(!qTest.isEmpty()) {
			System.out.println(qTest.poll());
		}
	}
}
