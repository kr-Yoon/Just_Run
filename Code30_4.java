package pro03;
	//�Ű������� ��ȯ���� ��� �ִ� ���.
import java.util.Scanner;

public class Code30_4 {
	static int add(int x, int y) {
		int result;
		result = x+y;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner typing = new Scanner(System.in);
		System.out.print("Enter integers : ");
		int a = typing.nextInt();
		System.out.print("Enter integers : ");
		
		int b = typing.nextInt();
		int c = add(a,b);
		System.out.println(a+" + "+b+" = "+c);
		
		typing.close();	//Scanner�� ������ ��Ʈ���� �޴� �Լ��̱� ������ ���� �޼ҵ带 ������־���Ѵ�.
		
	}

}
