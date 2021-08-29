package JustRunJava;
class Book4{
	private String title;
	private int price;
	
	Book4 (String title, int price){
		this.title = title;
		this.price = price;
	}
	
	void printBook() {
		System.out.println("title : "+title+", price : "+price);
	}
	
	String getTitle() {
		return title;
	}
	int getPrice() {
		return price;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
}
public class Code070 {

	public static void main(String[] args) {
		Book4 data = new Book4("yoon", 5000);
		data.printBook();
		
//		data.title = "sang";	//private�� class ���� Ű���带 �����صξ� ������ �ȵȴ�.
//		data.price = 10000;
		
		data.setTitle("sang");
		data.setPrice(10000);
		data.printBook();
		
		System.out.println(data.getPrice());
		System.out.println(data.getTitle());
		
	}
}
