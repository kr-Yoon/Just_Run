package pro05;
	//Ŭ���� ��� ��, �ڽ� Ŭ���� �����ڿ��� �̷������ ������ �� �����ؾ��Ѵ�.
	//�����ڸ� ������� ������ ����Ʈ �����ڴ� �ڵ������ȴ�. ��, �θ�Ŭ�������� ������ ��ð� ����� �Ѵ�.

class Father{
	Father(){
		System.out.println("Father class ��ü�� �����Ǿ����ϴ�.");
	}
	
	void printFather() {
		System.out.println("Father �޼ҵ带 ȣ���ϼ̽��ϴ�.");
	}
}

class Son extends Father{
	Son(){
		System.out.println("Son class ��ü�� �����Ǿ����ϴ�.");
	}
	
	void printSon() {
		System.out.println("Son �޼ҵ踦 ȣ���ϼ̽��ϴ�.");
	}
}
public class Code50 {
	public static void main(String[] args) {
		Son s1 = new Son();
		s1.printSon();
		s1.printFather();
	}

}
