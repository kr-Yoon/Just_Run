package JustRunJava;
class Data2{
//	private int x;
	public int y;
	int z;	//
}

public class Code069 {
	public static void main(String[] args) {
		Data2 data = new Data2();
//		data.x = 10;	//Data2 �ʵ� x�� private Ű���尡 �پ��ֱ⶧���� Ȯ���� �Ұ��ϴ�.
		data.y = 20;
		data.z = 30;
//		System.out.println(data.x);
		System.out.println(data.y);
		System.out.println(data.z);
	}

}
