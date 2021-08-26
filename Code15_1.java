package Just_Run;
	//형변환 과 캐스트연산자
public class Code15_1 {

	public static void main(String[] args) {
		long x = 10000L;
		float y;
		y = x;	//float은 long보다 메모리 할당량은 적지만, 표현범위가 크기에 수용가능하다.
		System.out.println("y : "+y);
		
		double z;
		z = x;
		System.out.println("z : "+z);
		
		char a = 'a';
		int b;
		b = a;
		System.out.println("b : "+b);
		System.out.println("b : "+(char)b);	//(char)은 캐스트 연산자로 일시적 호출(강제 형변환), 단 b의 값은 변하지 않는다.
		
	}

}
