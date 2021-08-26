package Just_Run;
	//단항연산자. a++ 선연산 후증가, ++a 선증가 후연산
public class Code8_1 {

	public static void main(String[] args) {
		int a = 10, b;
		b = a++;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
				
		int c = 10, d;
		d = ++c;
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		
		int hap, j, k, l;
		j = k = l = 0;
		hap = ++j + k++ + ++l;
		System.out.printf("%d, %d, %d, %d\n", hap, j, k, l);
	}

}
