package pro02;
	//�������� A&&B �� ��, A||B �� ��, !A �� ����

public class Code12 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 15;
		boolean b1 = a>b && c>d;	// &&�� �� ��(and)�̱� ������ ù ��Һ� �����ڰ� �����̱⿡ �״��� ������ �������� �ʰ� ������ �����ش�.
		boolean b2 = a!=b || b>c;
		boolean b3 = a<=b || c<=d;	// ||�� �� ��(or)�̱� ������ ù �������� ���� �����̾ ���� ������ Ȯ���Ѵ�.
		System.out.println(b1 + " " +b2+ " " +b3);
	}
}
