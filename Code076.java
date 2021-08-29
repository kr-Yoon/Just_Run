package JustRunJava;
	//super 메소드 이해		
class Mother{
	int dataA;
	
	Mother() {}		// super 메소드를 사용하지 않으면 기본생성자만을 디폴트생성자로 가지고온다.
	Mother(int dataA) {
		this.dataA = dataA;
	}
	
	void printA() {
		System.out.println("data A : "+dataA);
	}
}

class Child extends Mother{
	int dataB;
	
	Child() {}
	Child(int dataA, int dataB){
		super(dataA);		//부모클래스 필드 dataA에 인수값 대입 성공
//		this.dataA = dataA;	
		this.dataB = dataB;	//부므클래스 필드 dataA에 인수값 대입 실패
	}
	
	void printB() {
		System.out.println("data B : "+dataB);
	}
}
public class Code076 {
	public static void main(String[] args) {
		Child a = new Child(5,10);
		a.printA();
		a.printB();
	}

}
