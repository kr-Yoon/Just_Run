package JustRunJava;
	//Stack(interface List_Vector_Stack)
	//
import java.util.Stack;

public class Code144 {

	public static void main(String[] arsg) {
		Stack<Integer> sTest = new Stack<Integer>();
		sTest.push(1);
		sTest.push(2);
		sTest.push(3);
		
		Integer data = sTest.pop();	//���������� push�� �������� ��ȯ �� ����
		System.out.println(data);
		sTest.push(4);
		
		while(!sTest.empty()) {		//Stack��.empty() == �ش� Stack�� �������� �ִ��� ���θ� boolean���� ��ȯ
			System.out.println(sTest.pop());
		}
	}
}
   