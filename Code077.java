package JustRunJava;
	//super. Ű���带 �̿��� �θ�Ŭ������ �ʵ带 ȣ���� �� �ִ�.
	//this. Ű����� ��ü �ڽſ� ��ġ�� �ʵ带 ȣ���Ѵ�.
class Family{
	int data = 10;
	
	
}

class Home extends Family{
	int data = 20;

	void printData() {
		System.out.println("this is Family class data : "+super.data);
		System.out.println("this is Home class data to used 'this.' : "+this.data);
		System.out.println("this is Home class data : "+data);
	}
}

public class Code077 {
	public static void main(String[] args) {
		Home h1 = new Home();
		h1.printData();
	}

}
