package JustRunJava;

public class Code093 extends Code091 {
	private int year;
	public Code093(int id, String name, int year) {
		super(id, name);
		this.year = year;
	}
	
	public void show() {
		System.out.println("id : "+getId()+" name : "+getName()+" year : "+year);
	}
	
}
