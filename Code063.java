package JustRunJava;
	//static 필드, 공유의 개념
 class Data{
	 int value;
	 static int count;
	 
	 void print() {
		 System.out.println("value : "+value+"count : "+count);
	 }
 }
public class Code063 {

	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		
		
		d1.print();
		d2.print();
		
	}
}
