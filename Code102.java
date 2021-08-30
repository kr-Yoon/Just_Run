package JustRunJava;
	//클래스-인터페이스 상속
	//implements 키워드를 사용해주어야 하며, 상속받는 클레스는 추상메소드를 가져서는 안된다.
	//인터페이스의 모든 메소드를 오버라이딩 해야만 한다.
public class Code102 implements Code101{

	public void print() {
		System.out.println("i am Code102 Print!  "+Code101.COUNT);
	
	}
	public static void main(String[] args) {
		Code102 t1 = new Code102();
		t1.print();
	}
	}

