package pro04;
	//����Ʈ �����ڰ� ���� ���.
class Friend {
	
	String name;
	int age;
	
	void printFriend() {
		System.out.println("name : "+name+" age : "+age);
	}
//	Friend() {}	//�����ڰ� ���°��, �ڵ����� ����Ʈ �����ڸ� ����.
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
