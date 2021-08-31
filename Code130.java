package JustRunJava;
	//throws 예외구문
	//메소드 뒤에 선언해 둘 경우, 메소드 실행시 메소드에서 예외가 발생하는것이 아닌 호출구문에서 예외처리를 하도록 함.
	
public class Code130 {
	
public static void makeArray() throws ArrayIndexOutOfBoundsException
{
int a[] = new int[3];
a[0] = 10;
a[1] = 20;
a[2] = 30;
a[3] = 40;
a[4] = 50;
	
}



	public static void main(String[] args) {
	System.out.println("main starts");
	try {
	makeArray();
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception message : "+e.getMessage());
	}
	
	
	System.out.println("main ends");
	
	}

}
