package JustRunJava;
	//����Ʈ �����ڰ� �ִ� Ŭ����
class Dog1{
	
	String name = "�θ�";
	String color = "���";
	
	Dog1() {
		System.out.println("����Ʈ �����ڰ� ȣ��Ǿ����ϴ�.");
	}
	
	void printDog() {
		System.out.println("���� �̸��� "+name+" ������ "+color+"�Դϴ�.");
		}
	

	
}
public class Code060 {
	public static void main(String[] args) {
		Dog1 x = new Dog1();
		x.printDog();
	}
 
}
