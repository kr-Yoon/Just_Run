package JustRunJava;
	//�Ű������� �ְ�, ��ȯ���� ���� ���
public class Code048 {

	public static void find(int x, int y) {
		int result = 1;
		for(int a=1; a<=y; a++) {
			result *= x;
		}
		System.out.println(x+"�� "+y+"���� : "+result);
	}
	public static void main(String[] args) {
		
		int a=2, b=10;
		find(a,b);
			
	}
}
 