package JustRunJava;
	//Code104 �������̴� Code103�������̽��� ���
	//Code105�� implements�� ���� Code103�� ���
	//�������̽� �޼ҵ带 �������̵� �� ��� public ������� �����ؾ��Ѵ�.
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
