package pro05;
	//�޼ҵ忡�� super Ű���带 ����ϸ�, ���ϸ��� �޼ҵ������� ������ �����ϴ�.
class Super1{
	
	void print() {
		System.out.println("this is super1 print method");
	}
}

class Super2 extends Super1{
	
	void print() {
		super.print();
	}
}

public class Code53 {
	public static void main(String[] args) {
		Super2 s1 = new Super2();
		s1.print();
	}
	
}
