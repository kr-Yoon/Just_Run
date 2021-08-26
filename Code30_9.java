package Just_Run;
	//메소드 오버로딩
	//동일한 메소드 명에 매개변수가 다를경우 각각에 처리구문이 달라진다.
public class Code30_9 {
	
	static void overMethod() {
		System.out.println("no parameter");
	}
	static void overMethod(int a) {
		System.out.println("one parameter : "+a);
	}
	static void overMethod(int a, int b) {
		System.out.println("two parameter : "+a+b);
	}
	
		
	
	
	public static void main(String[] args) {
		overMethod();
		overMethod(1);
		overMethod(1, 2);
		
		
	}
}
