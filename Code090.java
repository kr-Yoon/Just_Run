package JustRunJava;
	//Code088�� ��ӹ��� Code089�� ���� ��ü����
	//Code089���� �������̵��� fly�޼ҵ� ��� �� if ���ǹ��� ���� ������(super.fly) �θ�Ŭ������ fly�޼ҵ带 ���
public class Code090 {

	public static void main(String[] args) {
		Code089 t1 = new Code089();
		t1.takeOff();
		
		t1.fly();
		
		t1.flymode = Code089.SUPERSONIC;
		t1.fly();
		
		t1.flymode = Code089.NORMAR;
		t1.fly();
		
		t1.land();
	}
}
