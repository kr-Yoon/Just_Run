package JustRunJava;
	// 메소드 없는 class, 객체없는 class 도 가능하다. 
class Dog {
	String name;
	int age;
	
	//Dog() {} 	//생성자, 안써도 자종입력
	
	
	}


public class Code058 {

	public static void main(String[] args) {
	
		Dog one = new Dog();	//Dog() == 생성자 호출
		Dog two = new Dog();
		
		one.name = "one";
		one.age =  13;
		
		two.name = "two";
		two.age = 5;
		
		System.out.println("나는 개를 두마리 키운다.");
		System.out.println("첫째 이름은"+one.name+"이며, 나이는 "+one.age+"이다.");
		System.out.println("둘째 이름은"+two.name+"이며, 나이는 "+two.age+"이다.");

	}

}
