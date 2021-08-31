package JustRunJava;

	//java.lang.StringBuffer 
public class Code123 {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Hello"); //기본16개 생성에 5개의 공간 추가, 공간에 hello 적재
		StringBuffer sb2 = new StringBuffer(); //기본 16개 char 공간 생성(null)
		sb2.append("World");
		StringBuffer sb3 = new StringBuffer(20);	//기본 16개 생성에 20개의 공간 추가
		sb3.append("123456789a123456789a123456789a123456789a12345");	
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());	//StringBuffer의 저장 크기를 반환한다.
		
	}
}

