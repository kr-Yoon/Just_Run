package JustRunJava;

public class Code092 extends Code091 {
	private String department;
	public Code092(int id, String name, String department) {
		super(id, name);
		this.department = department;
	}
	
	public void show() {
		System.out.println("id : "+getId()+" name : "+getName()+" department : "+department);
		
	}

}
