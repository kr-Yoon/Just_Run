package JustRunJava;

public class Code161 {
	public static void main(String[] args) {
		
		Animal cat = new Animal();
		cat.setName("봉구");
		System.out.println(cat.name);
	}
}

class Animal{
	String name;
	
	void setName(String name) {
		this.name = name;	//this 키워드는 객체를 가르킨다, 현 예제에서는 Animal의 인스턴트인 cat 객체를 가르킨다
							//즉, this.name = name 은 cat.name = 인자 name 과 같다
	}
}
