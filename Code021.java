package JustRunJava;
	//ĳ��Ʈ ������ ����
public class Code021 {

	public static void main(String[] args) {
		
		byte bi, bj;
		int i = 100, j = 300;
		bi = (byte)i;	
		System.out.println("bi : "+bi);
		bj = (byte)j;  //�Ͻ������� j�� ���� byteȭ, byte�� ǥ���Ҽ� �ִ� ���� -128 ~ 127 �̹Ƿ� �����ַ� ġȯ �� ǥ��
		System.out.println("bj : "+bj);
		
		byte b1 = 10, b2;
		int a = 5;
		b2 = (byte)(b1 + a);
		System.out.println("b2 : "+b2);
		

	}

}
