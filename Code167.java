package JustRunJava;

import java.util.Scanner;

//�빮�� > �ҹ���, �ҹ��� > �빮�� ��ȯ
//�ƽ�Ű �ڵ� �ҹ��� a~z : 97 ~ 122, �빮�� A~Z : 65 ~ 90.  +- 32�� ������ ����
public class Code167 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("���ڿ��� �Է����ּ��� : ");
		String insert = scan.next();
		 
		char[] asc = new char[insert.length()];
		
		for(int i=0;i<insert.length();i++) {		//in stream���� ���� �ڷᰪ�� char �ڷ������� ����
			asc[i] = insert.charAt(i);
		}
		
		for(int i=0;i<asc.length;i++) {		// asc���ڵ��� ��Һ񱳸� ����, �빮���� ��� +32 �ҹ����ϰ�� -32
			if (65<= asc[i] && asc[i] <=90) {
				asc[i] += 32;
			}
			
			else if (97 <= asc[i] && asc[i] <= 122) {
				asc[i] -= 32;
			}
		}
		
		System.out.println("�Է��Ͻ� ���ڿ��� ["+insert+"] �Դϴ�. ");
		System.out.print("��ȯ�� ���ڿ��� [");
		
		for(char i:asc) {
			System.out.print(i);
		}
		
//		for(int i=0;i<asc.length;i++) {
//		System.out.print(asc[i]);
//	}
		
		System.out.print("] �Դϴ�. ");
		
		scan.close();
	}
}
