package JustRunJava;
	//Ŭ���� ���
class Person12{
	String name;
	String phone;
	
	Person12(){}
	Person12(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	
	void printPerson() {
		System.out.println("name : "+name+" phone : "+phone);
	}
}

class Student3 extends Person12{
	private int score;
	
	Student3() {}
	Student3(String name, String phone, int score){
		super(name, phone);		//super �޼ҵ�� �ݵ�� �ڽ� ������ ù ���ο� ���Ǿ�� �ϸ�, �������� �ʾƵ� �ڵ������ȴ�.
		this.score = score;		//Student3 Ŭ���� ȣ�� �� , �θ�ä ���� - �ڽİ�ä ����(�θ�ä ������ ����)
	}
	
	void printStudent() {
		System.out.println("Student name :"+name+" phone : "+phone+" score : "+score);
	}
	
}

public class Code074 {

	public static void main(String[] args) {
		Student3 s1 = new Student3("Yoon", "010-0000-0000", 100);
		
	s1.printStudent();
	s1.printPerson();
	}
}
