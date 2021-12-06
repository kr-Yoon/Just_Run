package JustRunJava;

class Parent {
	Parent() {
		System.out.println(" 부모 클래스 ");
	}
}

public class Code173 extends Parent {
	
	Code173(){
		System.out.println(" 자식 클래스 ");
	}
	
	public static void main(String[] args) {
		
		Parent pa = new Parent();	//허용
		Code173 ch = new Code173();	//허용
		Parent pc = new Code173();	//허용
		Code173 cp = new Parent();	// 오류발생
		
	}

}
