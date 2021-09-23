package JustRunJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//10진수를 2진수로 변환
public class Code166 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();	//2진수화 후 담을 list
	
		System.out.println("2진수로 변환할 10진수를 입력해주세요 : ");
		int value = scan.nextInt();
		final int VALUE = value;
		while(true) {
			
			if(value == 1) {
				list.add(1);
				break;
			}
			
			else if(value % 2 == 1) {
				list.add(1);
				value /= 2;
			}
			else {
				list.add(0);
				value /= 2;
			}
		}
					 
		Collections.reverse(list);
		
		System.out.print("10진수 ["+VALUE+"] 을 2진수로 나타낸 결과는 [");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		System.out.print("] 입니다."); 
		
		scan.close();
	}
}

/* 
다른 풀이 (유튜브 풀이)
https://github.com/control-man/jinsslecture_basic_algorithm
package _4_DecToBin;

public class Main {

	public static void main(String[] args) {

		int inputNum = 25;
		int bin[] = new int[100]; 
		
		
		
		int i = 0;
		int mok = inputNum;
		
		while (mok > 0) {
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}
		
		i--;
		for (; i>=0; i--) {
			System.out.print(bin[i]);
		}
		
	}

}

*/