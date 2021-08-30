package JustRunJava;
	//Code088을 상속받은 Code089를 통한 객체생성
	//Code089에서 오버라이딩한 fly메소드 사용 및 if 조건문을 통해 지정된(super.fly) 부모클래스의 fly메소드를 사용
public class Code090 {

	public static void main(String[] args) {
		Code089 t1 = new Code089();
		t1.takeOff();
		
		t1.fly();
		
		t1.flymode = Code089.SUPERSONIC;
		t1.fly();
		
		t1.flymode = Code089.NORMAR;
		t1.fly();
		
		t1.land();
	}
}
