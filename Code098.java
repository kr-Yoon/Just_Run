package JustRunJava;
	//abstract �߻�Ŭ���� Ȱ��.
	//�߻�޼ҵ尡 ���Ե� Ŭ������ �ݵ�� �߻�Ŭ������ ����Ǿ�� �Ѵ�.
	//�߻�޼ҵ�� ��ӹ޴� Ŭ������ �������̵� �� ���� �����ϰ� �����ϴ°��̱� ������ private Ű���带 ������� �ʴ´�.
public class Code098 extends Code097{
	public void print() {	//abstract Code097 override
		System.out.println("i am Code098 print method");
	}
	

	public void call() {
		System.out.println("i am Code098 call method");
	}
	public static void main(String[] args) {
		Code098 t1 = new Code098();
		t1.print();
		t1.show();
		t1.call();
	}
//		Code097 t2 = new Code097(); abstract Ŭ������ ��ü�� ��ü������ ������ �� ����.
}
