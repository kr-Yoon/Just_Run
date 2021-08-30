package JustRunJava;
	//Code94클래스를 상속받은 Code95, 96에 overriding
	//추상클래스의 필요성을 파악하는 활용예제
public class Code096 extends Code094 {
	//override_Code094
	public void print() {
		System.out.println("i am Code096 print method");
	}
	
	public void bang() {
		System.out.println("bang");
	}
	public static void main(String[] args) {
		Code094 c94 = new Code094();
		Code094 c95 = new Code095();
		Code094 c96 = new Code096();
		
		c94.show();
		c94.print();
		
		c95.show();
		c95.print();
		
		c96.show();
		c96.print();
	
		
		
	}
}
