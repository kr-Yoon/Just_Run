package JustRunJava;
//���׸����� Ư�� Ŭ������ ��ӹ��� ���, �ش� Ŭ������ Ŭ������ ��ӹ޴� ����Ŭ������ ���ǵ� Ŭ���� �ڷ����� ����� �� �ִ�.
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
		//��ӹ��� NumberŬ������ ���� ���� Ŭ�������� String Ŭ���� �ڷ����� �������� �ʾ� ����� �� ����.
		
		System.out.println("ig multiple : "+ig.multiple(10));
		System.out.println("dg multiple : "+dg.multiple(10));
	}
}
   