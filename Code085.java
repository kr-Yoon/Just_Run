package JustRunJava;
	//������ ��Ű�� ȣ�� �� Ȱ�� (JustRunJava��Ű�� Code84Ŭ����)
	//import ��Ű����.Ŭ������; �� ���� ����ϰ��� �ϴ� Ŭ������ ȣ���Ѵ�
	//public Ű���尡 �پ�������� �������� ȣ�Ⱑ���ϸ�, default Ű������ ��� ���� ��Ű�� �̳������� ��밡���ϴ�.
	//private Ű���尡 ���� Ŭ������ ���� Ŭ���� �̳������� ��� �� ȣ���� �����ϴ�.
	//protected Ű���尡 ���� Ŭ������ ������Ű�� ������ ���� �����ϸ�, �ٸ� ��Ű���� Ŭ�������� ����� �����ϰ� �Ѵ�

//import JustRunJava.Code084;	//��Ű�� JustRunJava�� Ŭ����Code084�� �ش� Ŭ�������� ȣ���ϰڴ�.
public class Code085 {

	public static void main(String[] args) {
		//pro06.Code084 b1 = new pro06.Code084(1, "BookTest", 50000); ���� ȣ��
		Code084 b1 = new Code084(1, "BookTest", 50000); 	//���� ȣ��

		b1.printBookInfo();
		
		System.out.println(b1.getCode());
		System.out.println(b1.getPrice());
		System.out.println(b1.getTitle());
	}
}
