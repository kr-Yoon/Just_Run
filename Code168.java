package JustRunJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Code168 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int first = scan.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int second = scan.nextInt();
		
		GreatestCommonDivisor test = new GreatestCommonDivisor(first, second);
		System.out.println("["+first+"] 와 ["+second+"] 의 최대공약수는 ["+test.run()+"] 입니다.");
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
	
	void runFirst() {	//첫번째 인자 약수를 계산 후 firstA 리스트에 add

		for(int i=1;i<=first;i++) {
			if(first % i == 0) {
				firstA.add(i);
			}
		}
		
	}
	
	void runScoend() {	// 두번째 인자 약수를 계산 후 secondA 리스트에 add
			
		for(int i=1;i<=second;i++) {
			if(second % i == 0) {
				secondA.add(i);
			}
		}
	}
	
	void finalGCD() {	// 공약수를 찾아 가장 큰 공약수를 num에 대입
		for(int i=0;i<secondA.size();i++) {
			
		
		if(firstA.contains(secondA.get(i))) {
			if(secondA.get(i) > num) {
			num = secondA.get(i);
				}
			}
		}
		
	}
	
	int run() {	//메소드 시행
		runFirst();
		runScoend();
		finalGCD();
		
		return num;
	}
	
	
}

/* 
다른 풀이 (유튜브 풀이)
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