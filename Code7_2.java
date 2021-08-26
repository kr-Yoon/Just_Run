package Just_Run;
	//byte, short 자료형은 연산할때(cpu)자동으로 int로 형변환이 이루어진다.
	//cpu에서 관리할 수 있는 최적의 용량이 4byte때문이다.

public class Code7_2 {
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		int b3;
		
		b3 = b1 + b2;	
		System.out.println(b3);
	}
	
}
