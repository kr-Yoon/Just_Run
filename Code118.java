package JustRunJava;
	//Object Ŭ������ ��ӹ޾� equals �޼ҵ尡 �������� �ƴ� ��ü��ü�� �����ִ� �޼ҵ�� ����.
	//Object Ŭ������ �⺻������ ��� Ŭ������ ��ӵǱ� ������ ������ extends Object�� ������ �ʿ䰡 ����.
public class Code118 {
	public String id;
	
	Code118(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Code118) {
			Code118 member = (Code118)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] arsg) {
		Code118 t1 = new Code118("red");
		Code118 t2 = new Code118("red");
		Code118 t3 = new Code118("Green");
		
		if(t1.equals(t2)) {
			System.out.println("t1, t1 is equals");
		}
		else {
			System.out.println("t1, t2 is un equals");
		}
		
		if(t1.equals(t3)) {
			System.out.println("t1, t3 is equals");
		}
		else {
			System.out.println("t1, t3 is un equals");
		}
	}
}
