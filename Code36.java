package pro04;
	//�Ű������� �ִ� ������, ����Ʈ ������ �������־���Ѵ�.
class Friend1{
	String name;
	int age;
	
	void printFriend() {
		System.out.println("name : "+name+" age : "+age);
	}
	
	Friend1() {}	//�Ű������� �����ϴ� �����ڸ� �����ϸ�, ����Ʈ �����ڸ� �ڵ����� ���������� �ʴ´�.
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
