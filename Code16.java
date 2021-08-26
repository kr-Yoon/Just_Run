package Just_Run;
	//불리언 논리 연산자
public class Code16 {

	public static void main(String[] args) {
		int a = 10, b = 5, c = 20;
		boolean w, x, y , z;
		
		w = a>b;
		x = a == c;
		y = (a>b) && (b!=c);
		z = !(a==b) || (a<b);	//소괄호는 연산우선을 두기 위함
		
		
		System.out.println("w : "+w);
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("z : "+z);
		
	}

}
