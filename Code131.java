package JustRunJava;
@SuppressWarnings("serial")
class MyException extends Exception {
	int x;
	MyException(int x){
		this.x = x;
	}
	@Override
	public String toString() {
		return "i am " +x+" in MyException class";
	}
}
public class Code131 {
	public static void main(String[] args) {
		MyException me = new MyException(10);
		
		try {
			System.out.println("before thorw MyException");
			throw me;	//예외를 발생시킴
			//throw new ArrayIndexOutOfBoundsException();
		}
		catch(MyException e) {
			System.out.println(e);
		}
		
		System.out.println("Main ends");
			
		
	}

}
