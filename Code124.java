package JustRunJava;

public class Code124 {
public static void main(String[] args) {
	StringBuffer sb1 = new StringBuffer("Good Moring");
	sb1.append('!');
	sb1.append(" yoon!");
	System.out.println(sb1);
	
	StringBuffer sb2 = new StringBuffer("water");
	StringBuffer sb3 = new StringBuffer("wafer");
	
	System.out.println("sb2.charAt(2) : "+sb2.charAt(2));	//�ش� index ���� ���
	System.out.println("sb2.compareTo(sb3) : "+sb2.compareTo(sb3));	//index�� ���� �ٸ� ���ڰ� �߽߰� �����ڵ� ���� ��ȯ
	
	StringBuffer sb4 = new StringBuffer("Java Programming Language");
	sb4.delete(5, 8);	//sb4���ڿ��� index 5���� 8�̸� ���� �ڷᰪ�� �����Ѵ�.
	System.out.println("sb4.delete(5, 9) : "+sb4);
	
	StringBuffer sb5 = new StringBuffer("Hello World");
	sb5.insert(5, ',');
	System.out.println("sb5.insert(5, ',') : "+sb5);	//ó������ ���� index�� �ּҿ� ���� ����, ���ڿ��� �����Ѵ�.
		System.out.println("sb5.substring(7) : "+sb5.substring(7));	//�ش� index���� ���ڿ� ��ȯ
	
	
	
}
}
