package JustRunJava;
	//Code94Ŭ������ ��ӹ��� Code95, 96�� overriding
	//�߻�Ŭ������ �ʿ伺�� �ľ��ϴ� Ȱ�뿹��
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
