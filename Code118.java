package JustRunJava;
	//Object 클래스를 상속받아 equals 메소드가 참조값이 아닌 객체자체를 비교해주는 메소드로 변경.
	//Object 클래스는 기본적으로 모든 클래스에 상속되기 때문에 별도의 extends Object를 선언할 필요가 없다.
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
