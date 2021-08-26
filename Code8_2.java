package Just_Run;
	//단항연산자 추가실습, 선연산/후증가/대입연산자의 순서를 잘 기억해야한다.
public class Code8_2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------------");
		x++;	// x==11
		++x;	// x==12
		System.out.println("x= "+x);
		
		System.out.println("---------------------");
		y--;	// y==9
		--y;	// y==8
		System.out.println("y= "+y);
		
		System.out.println("---------------------");
		z = x++;	// z==12 x==13
		System.out.println("z= "+z);
		System.out.println("x= "+x);
		
		System.out.println("---------------------");
		z = ++x;	// z==14 x==14
		System.out.println("z= "+z);
		System.out.println("x= "+x);
		
		System.out.println("---------------------");
		z = ++x + y++;	// z==23 y==9 x==15
		System.out.println("z= "+z);
		System.out.println("y= "+y);
		System.out.println("x= "+x);
		

	}

}
