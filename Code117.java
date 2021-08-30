package JustRunJava;

public class Code117 extends Object{
	private String name;
	private int count;
	
	Code117(){}
	Code117(String name, int count){
		this.name = name;
		this.count = count;
	}
	
	void print() {
		System.out.println("name : "+name);
		System.out.println("count : "+count);
	}
		@Override
		public boolean equals(Object obj) {
		if (this.name.equals(((Code117)obj).name) && this.count == ((Code117)obj).count)
				return true;
		return false;
	}

	public static void main(String[] args) {
		Code117 t1 = new Code117("desk",5);
		Code117 t2 = new Code117("desk",5);
		
		if(t1.equals(t2)) System.out.println("Same Thing");
		else System.out.println("Different Thing");
	}
}


