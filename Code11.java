package pro02;
	// ���� ������. �� ���� ũ�⸦ ���ϸ� ����� ���� �������� ���.
	// ��Һ�(>, >=, <, <=)�����ڿ� �����(==, !=) �����ڷ� ������. ����� �����ڰ� ��Һ� �����ں��� �����̴�.
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
