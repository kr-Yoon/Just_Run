package JustRunJava;
	//throws ���ܱ���
	//�޼ҵ� �ڿ� ������ �� ���, �޼ҵ� ����� �޼ҵ忡�� ���ܰ� �߻��ϴ°��� �ƴ� ȣ�ⱸ������ ����ó���� �ϵ��� ��.
	
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
