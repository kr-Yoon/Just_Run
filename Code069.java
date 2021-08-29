package JustRunJava;
class Data2{
//	private int x;
	public int y;
	int z;	//
}

public class Code069 {
	public static void main(String[] args) {
		Data2 data = new Data2();
//		data.x = 10;	//Data2 필드 x는 private 키워드가 붙어있기때문에 확인이 불가하다.
		data.y = 20;
		data.z = 30;
//		System.out.println(data.x);
		System.out.println(data.y);
		System.out.println(data.z);
	}

}
