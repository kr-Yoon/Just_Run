package JustRunJava;
	//super �޼ҵ� ����		
class Mother{
	int dataA;
	
	Mother() {}		// super �޼ҵ带 ������� ������ �⺻�����ڸ��� ����Ʈ�����ڷ� ������´�.
	Mother(int dataA) {
		this.dataA = dataA;
	}
	
	void printA() {
		System.out.println("data A : "+dataA);
	}
}

class Child extends Mother{
	int dataB;
	
	Child() {}
	Child(int dataA, int dataB){
		super(dataA);		//�θ�Ŭ���� �ʵ� dataA�� �μ��� ���� ����
//		this.dataA = dataA;	
		this.dataB = dataB;	//�ι�Ŭ���� �ʵ� dataA�� �μ��� ���� ����
	}
	
	void printB() {
		System.out.println("data B : "+dataB);
	}
}
public class Code076 {
	public static void main(String[] args) {
		Child a = new Child(5,10);
		a.printA();
		a.printB();
	}

}
