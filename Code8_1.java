package Just_Run;
	//���׿�����. a++ ������ ������, ++a ������ �Ŀ���
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
