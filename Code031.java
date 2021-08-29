package JustRunJava;
	//중첩 반복문이란 반복문 안에 다른 반복문을 사용하는것을 의미한다.
public class Code031 {

	public static void main(String[] args) {
		System.out.println("------- while 중첩 반복문----------");
		int a, b;
		a = 1;
		while (a<10) {
		b = 1;
		while (b<10) {
			System.out.print(a+"*" +b+"="+ a*b+"  ");
			b++;
		}
		a++;
		System.out.println();
		}
		
		System.out.println("------- for 중첩 반복문----------");
		
		int c, d;
		for(c=1;c<10;c++) {
			for(d=1;d<10;d++) {
				System.out.print(c+"*"+d+"="+c*d+"  ");
			}
			System.out.println();
		}
		
		
		
	}
}
