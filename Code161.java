package JustRunJava;

public class Code161 {
	public static void main(String[] args) {
		
		Animal cat = new Animal();
		cat.setName("����");
		System.out.println(cat.name);
	}
}

class Animal{
	String name;
	
	void setName(String name) {
		this.name = name;	//this Ű����� ��ü�� ����Ų��, �� ���������� Animal�� �ν���Ʈ�� cat ��ü�� ����Ų��
							//��, this.name = name �� cat.name = ���� name �� ����
	}
}
