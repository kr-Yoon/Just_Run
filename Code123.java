package JustRunJava;

	//java.lang.StringBuffer 
public class Code123 {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Hello"); //�⺻16�� ������ 5���� ���� �߰�, ������ hello ����
		StringBuffer sb2 = new StringBuffer(); //�⺻ 16�� char ���� ����(null)
		sb2.append("World");
		StringBuffer sb3 = new StringBuffer(20);	//�⺻ 16�� ������ 20���� ���� �߰�
		sb3.append("123456789a123456789a123456789a123456789a12345");	
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());	//StringBuffer�� ���� ũ�⸦ ��ȯ�Ѵ�.
		
	}
}

