package JustRunJava;
	//getMessage�� �̿��� exception �޼��� ��ȯ
	//�߻��� �� �ִ� ���ܸ� �̸� �ľ��ϰ� ������ �� �־���Ѵ�.
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
