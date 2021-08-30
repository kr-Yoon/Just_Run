package JustRunJava;
	//abstract 추상클래스 활용.
	//추상메소드가 포함된 클래스는 반드시 추상클래스로 선언되어야 한다.
	//추상메소드는 상속받는 클래스가 오버라이딩 할 것을 생각하고 선언하는것이기 때문에 private 키워드를 사용하지 않는다.
public class Code098 extends Code097{
	public void print() {	//abstract Code097 override
		System.out.println("i am Code098 print method");
	}
	

	public void call() {
		System.out.println("i am Code098 call method");
	}
	public static void main(String[] args) {
		Code098 t1 = new Code098();
		t1.print();
		t1.show();
		t1.call();
	}
//		Code097 t2 = new Code097(); abstract 클래스는 객체를 자체적으로 생성할 수 없다.
}
