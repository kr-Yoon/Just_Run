package JustRunJava;
	//switch ���ù�, switch(����) {case1 ������ ���� case1�̸� ����}....default ������ ���� ��� �������� �������...break }
	//switch ���ù��� �������� ���� case�� �ٷ� �б��ϱ⿡ ó���ӵ��� �ξ� ������.
	//�����ϰ��� �ϴ� ���� ��Ȯ�Ұ�� ����ϴ°��� �����Ͱ���.
public class Code024 {

	public static void main(String[] args) {
		int score = 80;
		char grade;
		
		switch(score) {
		case 90:
			grade = 'A';
			break;	//break���� ���������� ���� �� ���� ��� �ڵ带 �����ع����⿡ �ݵ�� �ʼ������̴�.
		case 80:
			grade = 'B';
			break;
		case 70:
			grade = 'C';
			break;
		default:
			grade = 'D';
			break;
		}
		System.out.println("grade : "+grade);
		
	}
}
