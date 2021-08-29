package JustRunJava;
	//대입연산자. 오른쪽의 값을 왼쪽에 넣는다.
public class Code018 {

	public static void main(String[] args) {
		int a = 30, b = 11, c = 7, d = 10;
		a += b + c - d;
		System.out.println(a);
		
		a %= b - c;	//산비논대 순 진행, 산술연산자 b-c 이후 복합대입연산자 실행. 
		System.out.println(a);
		
	}
}
