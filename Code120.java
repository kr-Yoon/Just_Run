package JustRunJava;
	//object 오버라이딩

class Thing {
	private String name;
	private int price;
	
	Thing(String name, int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "name :"+name+", price: "+price;
	}
}


public class Code120 {
	public static void main(String[] args) {
		
		Thing a = new Thing("book", 5000);
		
		String b = a.toString()	;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	

}
