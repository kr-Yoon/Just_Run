package JustRunJava;
	//�Ҹ��� �� ������
public class Code022 {

	public static void main(String[] args) {
		int a = 10, b = 5, c = 20;
		boolean w, x, y , z;
		
		w = a>b;
		x = a == c;
		y = (a>b) && (b!=c);
		z = !(a==b) || (a<b);	//�Ұ�ȣ�� ����켱�� �α� ����
		
		
		System.out.println("w : "+w);
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("z : "+z);
		
	}

}
