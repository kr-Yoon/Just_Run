package pro02;
	// 관계 연산자. 수 간의 크기를 비교하며 결과는 참과 거짓으로 출력.
	// 대소비교(>, >=, <, <=)연산자와 동등비교(==, !=) 연산자로 나뉜다. 동등비교 연산자가 대소비교 연산자보다 하위이다.
public class Code11 {
	
	public static void main(String[] args) {
		int a = 50, b = 30, c = 60;
		boolean b1 = a>b;
		boolean b2 = b>c;
		boolean b3 = b>=c;
		boolean b4 = b<=c;
		boolean b5 = a==b;
		boolean b6 = a!=b;
		
		System.out.println(b1 + " " + b2 + " " + b3);
		System.out.println(b4 + " " + b5 + " " + b6);
	
	}
}
