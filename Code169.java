package JustRunJava;
//소수 판별
import java.util.Scanner;

public class Code169 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		boolean flag = true;
		System.out.print("정수를 입력해주세요 : ");
		num = scan.nextInt();
		
		for(int i=2;i<num;i++) {	
//소수는 자기자신과 1 제외 약수가 없는 정수를 의미하기때문에 1과 자기자신을 제외(2<x<num)한 값을 나눈 나머지가 0이 있으면 안되는것을 연산 
			
			if(num%i == 0) {
				flag = false;
			}
						
		}
		
		String result = (flag)?"소수 입니다.":"소수가 아닙니다.";
		
		System.out.println("["+num+"] 은 "+result);
		
		scan.close();
	}
	
}

/* 
다른 풀이 (유튜브 풀이)
출처 : https://github.com/control-man/jinsslecture_basic_algorithm

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
			System.out.println(num + " 은 소수 입니다.");
		}
		else {
			System.out.println(num + " 은 소수가 아닙니다");
		}


	}

}

*/