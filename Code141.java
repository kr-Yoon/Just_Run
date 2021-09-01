package JustRunJava;
	//제네릭 와일드카드
	//제네릭이 상속받은 클래스와 무관하게 모든 클래스자료형을 받을 수 있다.
	//단 제네릭 상속에서 호출가능한 클래스가 한정적이기때문에, 와일드카드를 사용한 메소드로 가져 올 수가 없게된다(제약)                                       
class WithWild<T extends Number>{
	T data;
	WithWild(T data){
		this.data = data;
	}
	
	boolean same(WithWild<?> x) {
		if(Math.abs(data.doubleValue()) == Math.abs(x.data.doubleValue())) { 
			return true;
		}
		else return false;
	}
}
public class Code141 {
	public static void main(String[] args) {
		WithWild<Double> d = new WithWild<Double>(6.0);
		WithWild<Integer> i = new WithWild<Integer>(-6);
		WithWild<Long> l = new WithWild<Long>(5L);
		
		if(d.same(i)) {
			System.out.println("d and i are equals");
		}
		else System.out.println("d and i are different");
		
		if(d.same(l)) {
			System.out.println("d and l are equals");
		}
		else System.out.println("d and l are different");
	}

}
