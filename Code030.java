package JustRunJava;
	//continue ����
	//�ݺ����� ��� �����ϰ������, �߰��� ������ �ϴ� ���� ������ ���.
	//continue�� ����Ǹ�, continue�� �� �߰�ȣ ������ �ڵ带 ������ä, �������� ����.
public class Code030 {

	public static void main(String[] args) {
		int a = 0;
		while (a<10)
		{ a++;
		if (a%3==0) continue;
		System.out.println(a);
		}
	}
}
