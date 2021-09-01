package JustRunJava;
	//제네릭형 클래스에도 여러 매개변수를 인자로 받을 수 있다.
	//관습적으로 대문자 영어 하나로 선언한다.
class GenericTest <T, V>{
	private T data1;
	private V data2;
	
	GenericTest(T data1, V data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	
	void genericTypeShow() {
		System.out.println("data1 Type : "+data1.getClass().getName());
		System.out.println("data2 Type : "+data2.getClass().getName());
	}
	
	T getData1() {
		return data1;
	}
	V getData2() {
		return data2;
	}
	
}

public class Code139 {
	public static void main(String[] args) {
		GenericTest<Integer, String> gt = new GenericTest<Integer, String>(100, "Yoon");
		
		gt.genericTypeShow();
		System.out.println(gt.getData1());
		System.out.println(gt.getData2());
	}

}
