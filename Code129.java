package JustRunJava;
	//getMessage를 이용한 exception 메세지 반환
	//발생할 수 있는 예외를 미리 파악하고 예상할 수 있어야한다.
public class Code129 {
	public static void main(String[] args) {
		int A[] = new int[5];
		try {
			A[7] = 100;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception message : "+e.getMessage());
		}
		
	}
	
}
