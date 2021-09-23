package JustRunJava;
// 자바 알고리즘 예제 100_2 피보나치 수열
import java.util.Scanner;

public class Code164 {

 static int Fibo(int num){
		
		if(num <= 1) {
			int result = 1;
			return result;
		}
		
		else if (num >= 2) {
			int result = Fibo(num-1) + Fibo(num-2);
			return result;
		}
		
		else
			return 0;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		for(String answer="y";answer.equals("y");i++) {
				
			System.out.println("피보나치 수열 "+(i+1)+" 번째 : ["+Fibo(i)+"]");
			
			System.out.println("다음 결과를 보시겠습니까? (y/n)");
			answer = sc.next();
		}
		System.out.println("피보나치 수열을 종료합니다..");
		sc.close();

	}

}

/* 
다른 풀이 (유튜브 풀이)

package _2;

public class Main {

	public static void main(String[] args) {

		int []arr = new int[100];
		
		//An = An-1 + An-2;  n>=3
		//a1 = 1, a2 = 1
		arr[1] = 1;
		arr[2] = 1;
		
		for (int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for (int i=1; i<=10; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//2¹øÂ° ¹æ¹ý.
		//An
		//An = An-1 + An-2;  n>=3
		//a1 = 1, a2 = 1
		System.out.println();
		
		int prevPrevNum = 1; //An-2 
		int prevNum = 1;      //An-1
		System.out.print(prevPrevNum+" ");
		System.out.print(prevNum+" ");
		
		for (int i=3; i<=10; i++) {
			int nNum = prevPrevNum+prevNum;
			System.out.print(nNum+" ");
			
			prevPrevNum = prevNum;
			prevNum = nNum;
		}
		

	}

}

*/
