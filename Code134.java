package JustRunJava;

import java.io.IOException;

public class Code134 {

	public static void main(String[] args) {
		System.out.print("Enter one char  ");
		int x;
		
		
		try {
		x = System.in.read();
		System.out.println("You entered : "+x);
		System.out.println("You entered : "+(char)x);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
