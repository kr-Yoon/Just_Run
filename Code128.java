package JustRunJava;

public class Code128 {

	public static void main(String[] args) {
		int[] t1 = {1,2,3,4,5};
		int i=0;
		try {
		for(i=0;i<=5;i++) {
			System.out.println(t1[i]);
		}
		
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(i+"는 없는 index 입니다.");
			
		}
		
	}
}
