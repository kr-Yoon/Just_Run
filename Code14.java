package Just_Run;
	//연산자 우선순위_산비논대(산술연산자에서는 단항연산자가 가장 순위가 높다.)
public class Code14 {

	public static void main(String[] args) {
		int a = 20, b = 7, c = 30, d = 2, e = 8;
		int x = a / b + c * d % e;
		System.out.println("x = "+x);
		
		boolean y = a > b + c && d < 8;
		System.out.println("y = "+y);
		
		int z = 100;
		z += a + b - c * d / e;
		System.out.println("z = "+z);

	}

}
