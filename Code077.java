package JustRunJava;
	//super. 키워드를 이용해 부모클래스의 필드를 호출할 수 있다.
	//this. 키워드는 객체 자신에 위치한 필드를 호출한다.
class Family{
	int data = 10;
	
	
}

class Home extends Family{
	int data = 20;

	void printData() {
		System.out.println("this is Family class data : "+super.data);
		System.out.println("this is Home class data to used 'this.' : "+this.data);
		System.out.println("this is Home class data : "+data);
	}
}

public class Code077 {
	public static void main(String[] args) {
		Home h1 = new Home();
		h1.printData();
	}

}
