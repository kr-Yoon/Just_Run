package JustRunJava;
	//제네릭
	//클래스, 인터페이스, 메소드, 필드의 자료형을 매개변수화 하여, 호출하는 곳에서 자료형을 지정.
	//기본자료형이 아닌 레퍼런스형만 사용할 수 있다.
 class Data22<T> {
T obj;

	Data22(T obj){
	this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}

	void showType() {
		System.out.println("Data T type : "+obj.getClass().getName());
	}
 }

	public class Code138 {
		public static void main(String[] args) {
		
			Data22<Integer> i = new Data22<Integer>(100);
			Data22<String> s = new Data22<String>("Yoon");
			
			System.out.println(i.getObj());
			i.showType();
			
			System.out.println(s.getObj());
			s.showType();
			
			
		
	}

}
