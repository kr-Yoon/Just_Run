package JustRunJava;
	//Code088 ���, fly�޼ҵ� �������̵�

public class Code089 extends Code088 {
	public static final int NORMAR = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAR;
	public void fly() {
		if(flymode == SUPERSONIC) {
		System.out.println("������ �����մϴ�");
	}
		else { 
			super.fly();	//��ü�� �θ�Ŭ����(Code088)�� �޼ҵ� fly�� ��Ī.
		}

	}
}
