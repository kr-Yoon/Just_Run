package JustRunJava;
	//추상클래스 106을 Code107, 108이 extends로 상속받아 오버라이딩
public class Code108 extends Code106{
	void print() {
		System.out.println("Code108");
	}

	public static void main(String[] args) {
		Code106 t1 = new Code108();
		Code106 t2 = new Code107();
		
		t1.print();
		t2.print();
			
	}
}
