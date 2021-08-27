package pro05;
	//클래스 상속
class Person{
	String name;
	String phone;
	
	Person(){}
	Person(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	
	void printPerson() {
		System.out.println("name : "+name+" phone : "+phone);
	}
}

class Student3 extends Person{
	private int score;
	
	Student3() {}
	Student3(String name, String phone, int score){
		super(name, phone);		//super 메소드는 반드시 자식 생성자 첫 라인에 사용되어야 하며, 선언하지 않아도 자동생성된다.
		this.score = score;		//Student3 클래스 호출 시 , 부모객채 생성 - 자식객채 생성(부모객채 참조값 보관)
	}
	
	void printStudent() {
		System.out.println("Student name :"+name+" phone : "+phone+" score : "+score);
	}
	
}

public class Code49 {

	public static void main(String[] args) {
		Student3 s1 = new Student3("Yoon", "010-0000-0000", 100);
		
	s1.printStudent();
	s1.printPerson();
	}
}
