package JustRunJava;
	//java.lang.String 
public class Code122 {
	public static void main(String[] args) {
		
		String str = new String("Java Programming");
		String temp = new String("Java Coding");
		String temp2 = new String("Study");
		String temp3 = new String("gram");
		
		
		
		System.out.println("str.charAt(5) : "+str.charAt(5));
		//�Ű������� �޴� ���� �ش��ϵ� ���ڿ��� index ��ȯ
		System.out.println("str.compareTo(temp) : "+str.compareTo(temp));
		//�� ���ڿ��� index�� ���ذ��� Ʋ�� ���ڸ� �߰� �� �����ڵ��� ���� ��ȯ
		System.out.println("str.concat(temp2) : "+str.concat(temp2));
		//�� ���ڿ��� �ٿ��ش�
		System.out.println("str.contains(temp3) : "+str.contains(temp3));
		//A���ڿ��� B����, ���ڿ��� �ִ��� ���θ� ��ȯ���ش�.
		System.out.println("str.indexOf('P') : "+str.indexOf('P'));
		//���ڿ� �տ������� �ش� ����, ���ڿ��� �ִ��� Ȯ�� �� �� index ��ȯ
		System.out.println("str.indexOf('u') : "+str.indexOf('u'));
		//�Ű����� ���� ���ڿ��� ������� -1 ��ȯ
		System.out.println("str.lastindexOf('a') : "+str.lastIndexOf('a'));
		//���ڿ� �ڿ������� �ش� ����, ���ڿ��� Ȯ�� �� index ��ȯ
		System.out.println("str.length() : "+str.length());
		//���ڿ��� ���������̸� ��ȯ
		System.out.println("str.replace('a','A') : "+str.replace('a', 'A'));
		//���ڿ��� ��ġ�� A���ڸ� B�� ��ȯ
		
		
		
		
		
		
		
		
	}

}
