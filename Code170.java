package JustRunJava;
//팩토리얼
import java.util.Scanner;

public class Code170 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int result = 1;
		System.out.print("정수를 입력해주세요 : ");
		int num = scan.nextInt();
				
		for(int i=0;i<=num;i++) {
			
			if(i<2) {
				result *= 1;
			}
		
			else if(i>=2) {
				result *= i;
			}
			
		}
		
		System.out.println("["+num+"] 의 팩토리얼은 ["+result+"] 입니다.");
				
		scan.close();
	
	}
		
}



/* 
다른 풀이 (유튜브 풀이)
출처 : https://github.com/control-man/jinsslecture_basic_algorithm

package _8_Factorial;

public class Main {

	public static void main(String[] args) {

		int inputNum = 7;
		int accNum = 1;
		// 5! = 5 * 4 * 3 * 2 * 1
		// 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1

		for (int i = 1 ; i <= inputNum; i++) {
			accNum *= i;  // accNum = accNum * i;
		}

		System.out.println(accNum);

		accNum = 1;
		for (int i = inputNum ; i >= 1; i--) {
			accNum *= i;  // accNum = accNum * i;
		}

		System.out.println(accNum);

	}

}

*/