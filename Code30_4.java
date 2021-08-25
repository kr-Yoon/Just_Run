package pro03;
	//매개변수와 반환값이 모두 있는 경우.
import java.util.Scanner;

public class Code30_4 {
	static int add(int x, int y) {
		int result;
		result = x+y;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner typing = new Scanner(System.in);
		System.out.print("Enter integers : ");
		int a = typing.nextInt();
		System.out.print("Enter integers : ");
		
		int b = typing.nextInt();
		int c = add(a,b);
		System.out.println(a+" + "+b+" = "+c);
		
		typing.close();	//Scanner은 물리적 스트링을 받는 함수이기 때문에 종료 메소드를 사용해주어야한다.
		
	}

}
