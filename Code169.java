package JustRunJava;
//�Ҽ� �Ǻ�
import java.util.Scanner;

public class Code169 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		boolean flag = true;
		System.out.print("������ �Է����ּ��� : ");
		num = scan.nextInt();
		
		for(int i=2;i<num;i++) {	
//�Ҽ��� �ڱ��ڽŰ� 1 ���� ����� ���� ������ �ǹ��ϱ⶧���� 1�� �ڱ��ڽ��� ����(2<x<num)�� ���� ���� �������� 0�� ������ �ȵǴ°��� ���� 
			
			if(num%i == 0) {
				flag = false;
			}
						
		}
		
		String result = (flag)?"�Ҽ� �Դϴ�.":"�Ҽ��� �ƴմϴ�.";
		
		System.out.println("["+num+"] �� "+result);
		
		scan.close();
	}
	
}

/* 
�ٸ� Ǯ�� (��Ʃ�� Ǯ��)
��ó : https://github.com/control-man/jinsslecture_basic_algorithm

package _7_PrimeNumber;

public class Main {

	public static void main(String[] args) {

		int num = 7;

		boolean isPrimeNumber = true;

		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				//primeNumber X
				isPrimeNumber = false;
			}
		}

		if (isPrimeNumber) {
			System.out.println(num + " �� �Ҽ� �Դϴ�.");
		}
		else {
			System.out.println(num + " �� �Ҽ��� �ƴմϴ�");
		}


	}

}

*/