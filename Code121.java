package JustRunJava;
	//�����ڸ� ���� ��������, ���ͷ����� ���� ���� ����
public class Code121 {
	public static void main(String[] args) {
		String s1 = new String("Hello World");	//�����ڸ� ���� ��ü���� ��, �������� �� �ٸ���.
		String s2 = new String("Hello World");
		
		String s3 = "Hello World";	//���ͷ������� ��ä���� ��, heap�������� �ش� �ڷᰪ�� ã��, ������� �ش� ������ ����
		String s4 = "Hello World";
		

		if (s1 == s2){
			System.out.println("s1 == s2");
		}
		else System.out.println("s1 != s2");
		
		if (s3 == s4){
			System.out.println("s3 == s4");
		}
		else System.out.println("s3 != s4");
		
		
			}

}
