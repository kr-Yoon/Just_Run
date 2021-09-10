package JustRunJava;
// StringBuffer 이해
// StringBuffer은 문자열에 대입, 삭제가 자유롭다
// StringBuffer은 String 객체에 비해 무겁고 메모리 할당도 높다. 즉 해시코드를 유지한 채 문자열의 수정작업이 필요할경우만 선언
public class Code158 {
	public static void main(String[] args) {
		StringBuffer testb = new StringBuffer();
		testb.append("hello");
		System.out.println("testb 객체의 해시코드 : " + System.identityHashCode(testb));
		testb.append(" ");
		System.out.println("testb 객체의 해시코드 : " + System.identityHashCode(testb));
		testb.append("world");
		System.out.println("testb 객체의 해시코드 : " + System.identityHashCode(testb));
		
		System.out.println(testb);
		System.out.println("testb 객체의 해시코드 : " + System.identityHashCode(testb));
		// 한번의 testb 객체를 생성 후, 값 추가 = 같은 참조주소를 같는다.
		
		String tests = "";
		System.out.println("tests 객체의 해시코드 : " + System.identityHashCode(tests));
		tests += "hello";
		System.out.println("tests 객체의 해시코드 : " + System.identityHashCode(tests));
		tests += " ";
		System.out.println("tests 객체의 해시코드 : " + System.identityHashCode(tests));
		tests += "world";
		System.out.println("tests 객체의 해시코드 : " + System.identityHashCode(tests));
		
		System.out.println(tests);
		System.out.println("tests 객체의 해시코드 : " + System.identityHashCode(tests));
		// tests 객체에 연결연산자를 사용할 경우 새로운 String객체가 생성되고, 해당 참조주소가 tests에 반환된다
	}
}

