package JustRunJava;
	//Ŭ����-�������̽� ���
	//implements Ű���带 ������־�� �ϸ�, ��ӹ޴� Ŭ������ �߻�޼ҵ带 �������� �ȵȴ�.
	//�������̽��� ��� �޼ҵ带 �������̵� �ؾ߸� �Ѵ�.
public class Code102 implements Code101{

	public void print() {
		System.out.println("i am Code102 Print!  "+Code101.COUNT);
	
	}
	public static void main(String[] args) {
		Code102 t1 = new Code102();
		t1.print();
	}
	}

