package JustRunJava;
	//Queue는 인터페이스이기 때문에 생성자가 없어, Queue를 구현하려면 하위 클래스를 사용해야한다 LinkedList를 이용.
	//Stack이 막힌 원통 구조라면, Queue는 뚫린 원통 구조이다.
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
