package pro03;
	//다중 return
	//메소드에 return이 여러 개 있는 경우, 가장 먼저 만나는 return문을 수행한 뒤 메소드를 종료한다.
import java.util.Scanner;
public class Code30_5 {
	static boolean check(int n) {
		if (n % 2 == 0) 
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		
		Scanner typing = new Scanner(System.in);
		System.out.println("Enter one number");
		int x = typing.nextInt();
		if(check(x)==true)
			System.out.println(x+" is even number");
		else
			System.out.println(x+" is add number");
		
		typing.close();
		
		
	}
}
