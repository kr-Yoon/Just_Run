package JustRunJava;
	//생성한 패키지 호출 및 활용 (JustRunJava패키지 Code84클래스)
	//import 패키지명.클래스명; 을 통해 사용하고자 하는 클래스를 호출한다
	//public 키워드가 붙어있을경우 전역에서 호출가능하며, default 키워드일 경우 같은 패키지 이내에서만 사용가능하다.
	//private 키워드가 붙은 클래스는 같은 클래스 이내에서만 사용 및 호출이 가능하다.
	//protected 키워드가 붙은 클래스는 같은패키지 내에서 접근 가능하며, 다른 패키지의 클래스에서 상속이 가능하게 한다

//import JustRunJava.Code084;	//패키지 JustRunJava의 클래스Code084를 해당 클래스에서 호출하겠다.
public class Code085 {

	public static void main(String[] args) {
		//pro06.Code084 b1 = new pro06.Code084(1, "BookTest", 50000); 직접 호출
		Code084 b1 = new Code084(1, "BookTest", 50000); 	//직접 호출

		b1.printBookInfo();
		
		System.out.println(b1.getCode());
		System.out.println(b1.getPrice());
		System.out.println(b1.getTitle());
	}
}
