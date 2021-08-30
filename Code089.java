package JustRunJava;
	//Code088 상속, fly메소드 오버라이딩

public class Code089 extends Code088 {
	public static final int NORMAR = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAR;
	public void fly() {
		if(flymode == SUPERSONIC) {
		System.out.println("초음속 비행합니다");
	}
		else { 
			super.fly();	//객체의 부모클래스(Code088)의 메소드 fly를 지칭.
		}

	}
}
