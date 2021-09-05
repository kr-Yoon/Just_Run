package JustRunJava;
	//컬렉션 프레임워크 List 인터페이스
	//배열객체와 달리 Size(length)가 규정되어있지 않다.
	//리터럴 값이 아닌, 참조값만 저장할 수 있다.
	
import java.util.ArrayList;

public class Code142 {

	public static void main(String[] args) {
		ArrayList<String> listTest = new ArrayList<String>();
		listTest.add("Yoon");
		listTest.add("sang");
		listTest.add("hyun");
		  
		for(int i=0; i<listTest.size();i++) {
			System.out.println(listTest.get(i));
		}
	}
}
