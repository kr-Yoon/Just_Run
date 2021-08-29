package JustRunJava;
	//break 구문_루트를 강제로 종료할때 사용.
public class Code029 {
	public static void main(String[] args) {
		int a = 1;
		while (a<=10) {	//while 조건에 a는 10보다 작거나 같다가 선입력.
			if (a==5)	//while 처리문 안에 있는 if에서 a가 5와 같을때 break 선언 
				break;
			System.out.println("a : "+a);
			a++;
		}
		
		int b = 1;
		while (b<=5) {
			if (a==10)
				break;
			System.out.println("b :" +b);
			b++;
		}
		
	}
}
