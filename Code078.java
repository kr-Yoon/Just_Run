package JustRunJava;
	//메소드에도 super 키워드를 사용하면, 동일명의 메소드일지라도 구분이 가능하다.
class Super1{
	
	void print() {
		System.out.println("this is super1 print method");
	}
}

class Super2 extends Super1{
	
	void print() {
		super.print();
	}
}

public class Code078 {
	public static void main(String[] args) {
		Super2 s1 = new Super2();
		s1.print();
	}
	
}
