package JustRunJava;
	//java�� ���߻���� ������� �ʴ´�.
	//�ٸ�, �ϳ��� �θ� ������ �ڳడ ��ӹ��� �� �ִ�.
class Main1 {
	int a= 10;
	
	void print1() {
		System.out.println("i am main1 method");
	}
}

class Sub1 extends Main1 {
	int b=20;
	
	void print2() {
		System.out.println("i am sub1 method");
	}
}

class Sub2 extends Main1 {
	int c=30;
	
	void print3() {
		System.out.println("i am sub2 method");
	}
}
public class Code080 {
	public static void main(String[] args) {
		Sub1 s1 = new Sub1();
		Sub2 s2 = new Sub2();
		
		System.out.println("s1 a is "+s1.a);
		System.out.println("s1 b is "+s1.b);
		System.out.println("s2 a is "+s2.a);
		System.out.println("s2 c is "+s2.c);
		
		s1.print1();
		s1.print2();
		
		s2.print1();
		s2.print3();
		
	}

}
