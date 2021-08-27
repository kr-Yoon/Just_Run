package pro05;
	//클래스 상속 시, 자식 클래스 생성자에서 이루어지는 로직을 잘 생각해야한다.
	//생성자를 명시하지 않으면 디폴트 생성자는 자동생성된다. 단, 부모클래스에도 생성자 명시가 없어야 한다.

class Father{
	Father(){
		System.out.println("Father class 객체가 생성되었습니다.");
	}
	
	void printFather() {
		System.out.println("Father 메소드를 호출하셨습니다.");
	}
}

class Son extends Father{
	Son(){
		System.out.println("Son class 객체가 생성되었습니다.");
	}
	
	void printSon() {
		System.out.println("Son 메소듣를 호출하셨습니다.");
	}
}
public class Code50 {
	public static void main(String[] args) {
		Son s1 = new Son();
		s1.printSon();
		s1.printFather();
	}

}
