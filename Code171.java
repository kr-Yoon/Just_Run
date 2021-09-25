package JustRunJava;
import java.util.Scanner;
//�� �ڸ��� �� ���ϱ�
public class Code171 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		
		System.out.print("������ �Է����ּ��� : ");
		String value = scan.next();
		int[] valueInt = new int[value.length()];
		
		for(int i=1;i<=value.length();i++) {
			
			valueInt[i-1] = Integer.parseInt(value.substring(i-1, i));
			
		}
		
		for(int i:valueInt) {
			result += i;
		}
		
		System.out.println("["+value+"] �� �� �ڸ��� �� ���� ["+result+"] �Դϴ�.");
		
		scan.close();
	}
	
}

/* 
�ٸ� Ǯ�� (��Ʃ�� Ǯ��)
��ó : https://github.com/control-man/jinsslecture_basic_algorithm

package _9_sumOfDigits;

public class Main {

	public static void main(String[] args) {

		int inputNum = 4280;
		int accSum = 0;

		// 1232 => 123   =>  12   =>  1       =>  0 
		// 2         3        2       1 => 8


		while(inputNum > 0) {
			accSum += inputNum % 10;
			inputNum /= 10;
		}

		System.out.println(accSum);


	}

}

*/