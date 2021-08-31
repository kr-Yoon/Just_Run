package JustRunJava;
	//try~catch , finally을 이용하여 예외처리
public class Code127 {

	public static void main(String[] args) {
		int a =5, b=0, c;
		try {
			c = a/b;
			System.out.println("c :" +c);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
	}
}
