package JustRunJava;
	//인터페이스 Code109를 Code110,111 implements 받아 오버라이딩
public class Code111 implements Code109{
	public void print() {
		System.out.println("Code111");
	}
	
	public static void main(String[] args) {
		Code109 t1 = new Code110();
		Code109 t2 = new Code111();
		
		t1.print();
		t2.print();
		
	}

}
