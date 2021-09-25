package JustRunJava;
// 숫자사각형
import java.util.Scanner;

public class Code172 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("생성하고자 하는 사각형의 크기를 입력하세요 : ");
		int value = scan.nextInt();
		int count = 0;
		
		for (int i=0;i<value;i++) {
			
			for (int j=0;j<value;j++) {
				count++;
				System.out.printf("[%02d]",count);
				}
			
			System.out.println("");
		}
		
		scan.close();
	}
	
}

/* 
다른 풀이 (유튜브 풀이)
출처 : https://github.com/control-man/jinsslecture_basic_algorithm

package _10_numRec1_;

public class Main {

	public static void main(String[] args) {

		int n = 5;

//		  n = 3
//		  1 2 3 
//		  4 5 6
//		  7 8 9
		 
		//int num = 1;

		for (int j = 0; j < n ; j++) {

			for (int i=0; i < n ; i++) {
				System.out.printf("%4d", j*(n) + i + 1);
				//num++;
				//System.out.print(j*(n) + i + 1 + " ");
			}
			System.out.println();
		}


	}

}
0 comments on commit 2e4233f

*/