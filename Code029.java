package JustRunJava;
	//break ����_��Ʈ�� ������ �����Ҷ� ���.
public class Code029 {
	public static void main(String[] args) {
		int a = 1;
		while (a<=10) {	//while ���ǿ� a�� 10���� �۰ų� ���ٰ� ���Է�.
			if (a==5)	//while ó���� �ȿ� �ִ� if���� a�� 5�� ������ break ���� 
				break;
			System.out.println("a : "+a);
			a++;
		}
		
		int b = 1;
		while (b<=5) {
			if (a==10)
				break;
			System.out.println("b :" +b);
			b++;
		}
		
	}
}
