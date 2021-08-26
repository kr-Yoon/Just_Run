package pro04;
	//매개변수가 있는 생성자, 디폴트 변수를 생성해주어야한다.
class Friend1{
	String name;
	int age;
	
	void printFriend() {
		System.out.println("name : "+name+" age : "+age);
	}
	
	Friend1() {}	//매개변수가 존재하는 생성자를 정의하면, 디폴트 생성자를 자동으로 구현해주지 않는다.
	Friend1(String a, int b) {
		name = a;
		age = b;
	}
	
}
public class Code36 {
	public static void main(String [] args) {
		Friend1 x = new Friend1();
		x.printFriend();
		
		Friend1 y = new Friend1("Yoon", 30);
		y.printFriend();
	}

}
