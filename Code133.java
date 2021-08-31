package JustRunJava;
import java.util.Scanner;
public class Code133 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("name?" );
		String name = in.next();
		
		System.out.print("Phone number?" );
		String phone = in.next();
		
		System.out.print("age? ");
		int age = in.nextInt();
		
		System.out.print("height? ");
		float height = in.nextFloat();
		
		System.out.print("Gender? ");
		char gender = in.next().charAt(0);
		
		
		System.out.println("name : "+name);
		System.out.println("Phone number : "+phone);
		System.out.println("age : "+age);
		System.out.println("height : "+height);
		System.out.println("gender : "+gender);
		
		in.close();
	}
}
