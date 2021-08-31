package JustRunJava;
	//생성자를 통한 참조변수, 러터럴값을 통한 변수 차이
public class Code121 {
	public static void main(String[] args) {
		String s1 = new String("Hello World");	//생성자를 통한 객체생성 시, 참조값이 다 다르다.
		String s2 = new String("Hello World");
		
		String s3 = "Hello World";	//리터럴값으로 객채생성 시, heap영역에서 해당 자료값을 찾고, 있을경우 해당 참조값 대입
		String s4 = "Hello World";
		

		if (s1 == s2){
			System.out.println("s1 == s2");
		}
		else System.out.println("s1 != s2");
		
		if (s3 == s4){
			System.out.println("s3 == s4");
		}
		else System.out.println("s3 != s4");
		
		
			}

}
