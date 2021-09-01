package JustRunJava;
	//���׸� ���ϵ�ī��
	//���׸��� ��ӹ��� Ŭ������ �����ϰ� ��� Ŭ�����ڷ����� ���� �� �ִ�.
	//�� ���׸� ��ӿ��� ȣ�Ⱑ���� Ŭ������ �������̱⶧����, ���ϵ�ī�带 ����� �޼ҵ�� ���� �� ���� ���Եȴ�(����)                                       
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
