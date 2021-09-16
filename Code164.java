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
