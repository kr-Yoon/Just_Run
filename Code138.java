package JustRunJava;
	//���׸�
	//Ŭ����, �������̽�, �޼ҵ�, �ʵ��� �ڷ����� �Ű�����ȭ �Ͽ�, ȣ���ϴ� ������ �ڷ����� ����.
	//�⺻�ڷ����� �ƴ� ���۷������� ����� �� �ִ�.
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
