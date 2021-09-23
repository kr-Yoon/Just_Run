package JustRunJava;
// 자바예제 최빈수 구하기
// 예제에는 없지만 반복수가 같은 상황을 고려해 추가 코딩 진행
// 단, 반복수가 같은 경우는 두개의 값까지만 표기가능..더이상 만들려 했지만 지금의 자바 이해도 수준에서는 단순 노가다이며, 좀 더 효율적인 방안이 생기면 꼭 수정할것!

import java.util.Arrays;
import java.util.Random;

public class Code165 {
	public static void main(String[] args) {
		
		final int insert = 15;	// 입력값 자료의 갯수 설정
		final int num = 4;		// random 배정할 수의 최대값 (0 ~ num) 
		// 음수를 제외한 양수를 자유롭게 명시 가능하나, 반복수의 중복을 2개까지만 지원함으로 가급적 insert > num && insert != num*num && insert%num != 0 을 준수하는것을 권한다.
		
		int max = 0;
		int height = 0;
		int height2 = -1;
		
		int[] values = new int[insert];
		int[] count = new int[num+1];
		
		Random random = new Random();
				

		// values 배열의 값 자동생성
		for(int i=0;i<insert;i++) {
			values[i]=(random.nextInt(num+1));
			}
			
		// values 배열의 값 중 중복값을 count에 입력
		for(int i=0;i<insert;i++) {
			count[values[i]]++;
		}

		
		// 최대값 및 반복 횟수 확인
		for(int i=0;i<num+1;i++) {
			if (count[i]>max) {
				max = count[i];
				height = i;
			}
		}
		
		// 만약에 발생할 반복수가 같을 경우를 대비
		
		for(int i=0;i<num+1;i++) {
			if (count[i]==max && i!=height) {
				height2 = i;				
			}
		}
		
			
		System.out.println("생성 된 values 의 값 : "+Arrays.toString(values));
		
		if (height!=height2 && height2 != -1) {
			System.out.println("가장 많이 반복된 수는 ["+height+" , "+height2+"] 이며, values 배열 안에 ["+max+"]개가 있습니다.");
			}
		else
			System.out.println("가장 많이 반복된 수는 ["+height+"] 이며, values 배열 안에 ["+max+"]개가 있습니다.");
	}
}

/* 
다른 풀이 (유튜브 풀이)

package _3_mode;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int []inputNum = new int[10];
		for (int i=0; i<10 ; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		//사용자 input

		//1 2 2 3 1 4 2 2 4 3
		
		// 1: 2
		// 2: 4  --> 최빈수
		// 3: 2
		// 4: 2
		
		int []mode = new int [10];
		
		// index -> 출현한 수
		// index 값 -> index(출현한수)가 몇번나왔는지 저장하는 용도 
		
		// "mode[3] = 5, => 3번숫자가, 5번 출현했다"
		
		
		//inputNum => 1 2 2 3 1 4 2 2 4 3
		for (int i=0; i<10 ; i++) {
			  mode[inputNum[i]]++;  
		}
		 //mode[1] == 2
		 //mode[2] == 4
		 //mode[3] == 2
		 //mode[4] == 2
		
		
		int modeNum = 0; //최빈수 
		int modeCnt = 0; //최빈수가 나온횟수
		
		for (int i=0; i<10 ; i++) {
			if (modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수는:"+modeNum+" cnt:"+modeCnt);
		
	}

}

*/