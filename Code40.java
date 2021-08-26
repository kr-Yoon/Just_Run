package pro04;
	//this´Â 
class Friend3 {
	String name;
	int age;
	
	Friend3(String name, int age){
		this.name = name;
		this.age = age;
	}
	void hello() {
		System.out.println("hello");
	}
	void printFriend() {
		this.hello();
		System.out.println("name : "+this.name+", age : "+this.age);
	}
}

public class Code40 {

	public static void main(String[] args) {
		Friend3 f1 = new Friend3("Yoon", 30);
		f1.hello();
		f1.printFriend();

	}

}
