package Just_Run;
	//�޼ҵ� �����ε�
	//������ �޼ҵ� �� �Ű������� �ٸ���� ������ ó�������� �޶�����.
public class Code30_9 {
	
	static void overMethod() {
		System.out.println("no parameter");
	}
	static void overMethod(int a) {
		System.out.println("one parameter : "+a);
	}
	static void overMethod(int a, int b) {
		System.out.println("two parameter : "+a+b);
	}
	
		
	
	
	public static void main(String[] args) {
		overMethod();
		overMethod(1);
		overMethod(1, 2);
		
		
	}
}
