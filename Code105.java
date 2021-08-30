package JustRunJava;
	//Code104 인터페이는 Code103인터페이스를 상속
	//Code105는 implements를 통해 Code103을 상속
	//인터페이스 메소드를 오버라이딩 할 경우 public 접근제어를 선언해야한다.
public class Code105 implements Code104{
	private String title, author;
	
	Code105(){}
	Code105(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public void printInfo() {
		System.out.println("****** info for books******");
		
	}
	public void showTitle() {
		System.out.println("title : "+title+"  author : "+author);
	}

public static void main(String[] args) {
	Code105 t1 = new Code105("Yoon", "Sang");
	
	t1.printInfo();
	t1.showTitle();
}
}
