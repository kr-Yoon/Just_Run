package pro04;
class Book{
	String title;
	int price;
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
}
public class Code39 {

	public static void main(String[] args) {
		Book b1 = new Book("ÇÇÅÍÆÒ", 5000);
		Book b2 = new Book("¾Ë¶óµò", 10000);
		
		System.out.println(b1.title+b1.price);
		System.out.println(b2.title+b2.price);
	}
}
