package Just_Run;
	//����ȯ �� ĳ��Ʈ������
public class Code15_1 {

	public static void main(String[] args) {
		long x = 10000L;
		float y;
		y = x;	//float�� long���� �޸� �Ҵ緮�� ������, ǥ�������� ũ�⿡ ���밡���ϴ�.
		System.out.println("y : "+y);
		
		double z;
		z = x;
		System.out.println("z : "+z);
		
		char a = 'a';
		int b;
		b = a;
		System.out.println("b : "+b);
		System.out.println("b : "+(char)b);	//(char)�� ĳ��Ʈ �����ڷ� �Ͻ��� ȣ��(���� ����ȯ), �� b�� ���� ������ �ʴ´�.
		
	}

}
