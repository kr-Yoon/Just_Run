package JustRunJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Code168 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int first = scan.nextInt();
		
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int second = scan.nextInt();
		
		GreatestCommonDivisor test = new GreatestCommonDivisor(first, second);
		System.out.println("["+first+"] �� ["+second+"] �� �ִ������� ["+test.run()+"] �Դϴ�.");
		scan.close();
	}
}


class GreatestCommonDivisor{
	int first;
	int second;
	ArrayList<Integer> firstA = new ArrayList<>();
	ArrayList<Integer> secondA = new ArrayList<>();
	int num = 0;
	
	GreatestCommonDivisor(int first, int second){
		this.first = first;
		this.second = second;
	}
	
	void runFirst() {	//ù��° ���� ����� ��� �� firstA ����Ʈ�� add

		for(int i=1;i<=first;i++) {
			if(first % i == 0) {
				firstA.add(i);
			}
		}
		
	}
	
	void runScoend() {	// �ι�° ���� ����� ��� �� secondA ����Ʈ�� add
			
		for(int i=1;i<=second;i++) {
			if(second % i == 0) {
				secondA.add(i);
			}
		}
	}
	
	void finalGCD() {	// ������� ã�� ���� ū ������� num�� ����
		for(int i=0;i<secondA.size();i++) {
			
		
		if(firstA.contains(secondA.get(i))) {
			if(secondA.get(i) > num) {
			num = secondA.get(i);
				}
			}
		}
		
	}
	
	int run() {	//�޼ҵ� ����
		runFirst();
		runScoend();
		finalGCD();
		
		return num;
	}
	
	
}

/* 
�ٸ� Ǯ�� (��Ʃ�� Ǯ��)
https://github.com/control-man/jinsslecture_basic_algorithm

package _6_GCD;

public class Main {

	public static void main(String[] args) {
		
		int num1, num2;
		num1 = 30;
		num2 = 20;
		
		int small;
		int big;
		
		if (num1 > num2){
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small = num1;
		}
		
		int gcd = 1; //
		
		for (int i = 1 ; i <= small  ; i++) {
			if (big % i == 0 && small % i == 0) 
				gcd = i;
		}
		System.out.println(gcd);
	}

}
*/