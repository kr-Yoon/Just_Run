package JustRunJava;
	// �޼ҵ� ���� class, ��ü���� class �� �����ϴ�. 
class Dog {
	String name;
	int age;
	
	//Dog() {} 	//������, �Ƚᵵ �����Է�
	
	
	}


public class Code058 {

	public static void main(String[] args) {
	
		Dog one = new Dog();	//Dog() == ������ ȣ��
		Dog two = new Dog();
		
		one.name = "one";
		one.age =  13;
		
		two.name = "two";
		two.age = 5;
		
		System.out.println("���� ���� �θ��� Ű���.");
		System.out.println("ù° �̸���"+one.name+"�̸�, ���̴� "+one.age+"�̴�.");
		System.out.println("��° �̸���"+two.name+"�̸�, ���̴� "+two.age+"�̴�.");

	}

}
