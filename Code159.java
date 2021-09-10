package JustRunJava;
//StringBuffer substring, insert
public class Code159 {

	public static void main(String[] args) {
		StringBuffer test = new StringBuffer();
		test.append("world");
		System.out.println(test);
		test.insert(0, "hello ");	//0 index 에 문자열 삽입
		System.out.println(test);
		
		System.out.println(test.substring(0, 5));	//0 index 부터 5 index까지 반환
	}
}
