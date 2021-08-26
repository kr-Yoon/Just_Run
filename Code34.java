package pro04;
	//디폴트 생성자가 없는 경우.
class Friend {
	
	String name;
	int age;
	
	void printFriend() {
		System.out.println("name : "+name+" age : "+age);
	}
//	Friend() {}	//생성자가 없는경우, 자동으로 디폴트 생성자를 제공.
}


public class Code34 {

	public static void main(String[] args) {
		Friend x = new Friend();
		x.printFriend();
		
		x.name = "Yoon";
		x.age = 30;
		x.printFriend();
		
	}

}
