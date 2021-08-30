package JustRunJava;
	//디폴트 메소드
class Parent {
	void print() {
		System.out.println("i am Parent print");
	}
}

class Child5 extends Parent {
	void print() {
		super.print();
	}
}




public class Code112 {
	public static void main(String[] args){
		Child5 t1 = new Child5();
		t1.print();
	}

}
