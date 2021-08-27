package pro05;
	//다형성
class Mom{
	void print() {
		System.out.println("i am Mom class print method");
	}
	
	void test() {
		System.out.println("i am Mom class test method");
	}
}

class Boy extends Mom{
	void print() {
		System.out.println("i am Boy class print method");
	}
	void check() {
		System.out.println("i am Boy class check method");
	}
}
public class Code56 {
	public static void main(String[] args) {
		Mom m1 = new Mom();
		Boy b1 = new Boy();
		Mom x = new Boy();
		
		m1.print();
		m1.test();
//		m1.check();		//부모클래스는 자식클래스의 필드를 호출할 수 없다.
		System.out.println("---------------------------");
		
		b1.print();
		b1.test();
		b1.check();
		System.out.println("---------------------------");
		
		x.print();
		x.test();
//		x.check();		//다형성 구조를 갖는 참조변수 x는 부모클래스의 필드와 자식클래스에서 재정의된 부모클래스 필드 외 사용할 수 없다.
		

	}
}
