package JustRunJava;
//제네릭스가 특정 클래스를 상속받을 경우, 해당 클래스와 클래스를 상속받는 하위클래스에 정의된 클래스 자료형만 사용할 수 있다.
class GenericExtends<T extends Number>{
	T obj;
	GenericExtends(T obj){
		this.obj = obj;
	}
	
	int multiple(int n) {
		return obj.intValue()*n;
	}
	
	
	
}
public class Code140 {

	public static void main(String[] args) {
		GenericExtends<Integer> ig = new GenericExtends<Integer>(100);
		GenericExtends<Double> dg = new GenericExtends<Double>(4.5);
		//GenericExtends<String> sg = new GenericExtends<String>("Yoon");	
		//상속받은 Number클래스와 그의 하위 클래스에는 String 클래스 자료형이 존재하지 않아 사용할 수 없다.
		
		System.out.println("ig multiple : "+ig.multiple(10));
		System.out.println("dg multiple : "+dg.multiple(10));
	}
}
   