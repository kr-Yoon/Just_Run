package JustRunJava;
	//��ø �ݺ����̶� �ݺ��� �ȿ� �ٸ� �ݺ����� ����ϴ°��� �ǹ��Ѵ�.
public class Code031 {

	public static void main(String[] args) {
		System.out.println("------- while ��ø �ݺ���----------");
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
		
		System.out.println("------- for ��ø �ݺ���----------");
		
		int c, d;
		for(c=1;c<10;c++) {
			for(d=1;d<10;d++) {
				System.out.print(c+"*"+d+"="+c*d+"  ");
			}
			System.out.println();
		}
		
		
		
	}
}
