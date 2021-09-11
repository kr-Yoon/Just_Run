package JustRunJava;
//배열과 리스트
import java.util.ArrayList;

public class Code160 {

	public static void main(String[] args) {
		//배열(Array)는 길이가 고정적이다
		String a[] = {"a", "b"};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//ArrayList는 길이가 가변적이며, 인덱스 별 수정이 자유롭다
		ArrayList<String> b = new ArrayList<String>();
		b.add("a");
		b.add("c");
		b.add("d");
		System.out.println(b);
		
		b.add(1, "b");	//[1]index에 문자 "b" 삽입
		System.out.println(b);
		
		System.out.println(b.contains("c"));	//ArrayList b 안에 c가 있는지 여부를 boolean 타입으로 반환
		
		b.remove("d");	//ArrayList b 안에 "d"문자를 삭제, 해당하는 값이 없다면 작동 안함(예외발생 안함)
		System.out.println(b);
		
		b.remove(2);	//ArrayList b 의 [2]인덱스를 삭제, 해당 인덱스에 자료값이 없다면 예외발생
		System.out.println(b);
		
	}
}
