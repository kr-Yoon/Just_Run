package pro05;
	//������
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
//		m1.check();		//�θ�Ŭ������ �ڽ�Ŭ������ �ʵ带 ȣ���� �� ����.
		System.out.println("---------------------------");
		
		b1.print();
		b1.test();
		b1.check();
		System.out.println("---------------------------");
		
		x.print();
		x.test();
//		x.check();		//������ ������ ���� �������� x�� �θ�Ŭ������ �ʵ�� �ڽ�Ŭ�������� �����ǵ� �θ�Ŭ���� �ʵ� �� ����� �� ����.
		

	}
}
