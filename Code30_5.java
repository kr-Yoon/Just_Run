package pro03;
	//���� return
	//�޼ҵ忡 return�� ���� �� �ִ� ���, ���� ���� ������ return���� ������ �� �޼ҵ带 �����Ѵ�.
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
