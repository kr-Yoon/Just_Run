package pro01;

public class Code4_4 {

	public static void main(String[] args) {
		long a = 500;
		long b = 700L;
		long c = 1000L;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		 
		// long l = 2147483648;
		// System.out.println(l);	//에러발생_int의 범위를 벗어나면 L을 붙여 주어야한다.
		
		long l = 2147483647;
		System.out.println(l);
		l++;
		System.out.println(l);

	}

}
