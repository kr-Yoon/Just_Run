package pro04;
//private
class Book3{
	private String title;
	private int price;
	
	Book3 (String title, int price) {
		this.title = title;
		this.price = price;
	}
	void printBook() {
		System.out.println("title : "+title+", price : "+price);
	}
}
public class Code43 {
	public static void main(String[] args) {
		Book3 b1 = new Book3("Yoon",10000);
		b1.printBook();
//		b1.price = 2000; //private로 class 한정이므로 볼수 없음.
	}

}
