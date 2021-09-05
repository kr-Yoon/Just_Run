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
		
		Integer data = sTest.pop();	//마지막으로 push한 참조값을 반환 후 삭제
		System.out.println(data);
		sTest.push(4);
		
		while(!sTest.empty()) {		//Stack명.empty() == 해당 Stack에 참조값이 있는지 여부를 boolean으로 반환
			System.out.println(sTest.pop());
		}
	}
}
   