package JustRunJava;

class Parent {
	Parent() {
		System.out.println("�θ� Ŭ����");
	}
}

public class Code173 extends Parent {
	
	Code173(){
		System.out.println("�ڽ� Ŭ����");
	}
	
	public static void main(String[] args) {
		
		Parent pa = new Parent();	//���
		Code173 ch = new Code173();	//���
		Parent pc = new Code173();	//���
		Code173 cp = new Parent();	// �����߻�
		
	}

}
