package JustRunJava;
	//Code086 클래스의 메소드를 오버라이딩
//import JustRunJava.Code086;

public class Code087 extends Code086 {
	public void show() {
		System.out.println("i am child show");
	}
	
	public static void main(String[] args) {
		Code087 t1 = new Code087();
		t1.show();
		
	}

}
