package JustRunJava;
import java.util.*;
	//�������̽� ����
	//�������̽� �ʵ�(���)�� Ȱ��
public class Code100 {
	public static void main(String[] args) {
		Scanner typing = new Scanner(System.in);
		System.out.println("Enter number between 0 and 100");
		int num = typing.nextInt();
		
		if (num<Code099.MIN || num>Code099.MAX) {
			System.out.println("Out of range");
		}
		typing.close();
	}

}
