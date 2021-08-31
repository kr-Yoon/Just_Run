package JustRunJava;

public class Code124 {
public static void main(String[] args) {
	StringBuffer sb1 = new StringBuffer("Good Moring");
	sb1.append('!');
	sb1.append(" yoon!");
	System.out.println(sb1);
	
	StringBuffer sb2 = new StringBuffer("water");
	StringBuffer sb3 = new StringBuffer("wafer");
	
	System.out.println("sb2.charAt(2) : "+sb2.charAt(2));	//해당 index 문자 출력
	System.out.println("sb2.compareTo(sb3) : "+sb2.compareTo(sb3));	//index를 비교해 다른 문자값 발견시 유니코드 차이 반환
	
	StringBuffer sb4 = new StringBuffer("Java Programming Language");
	sb4.delete(5, 8);	//sb4문자열의 index 5에서 8미만 까지 자료값을 제거한다.
	System.out.println("sb4.delete(5, 9) : "+sb4);
	
	StringBuffer sb5 = new StringBuffer("Hello World");
	sb5.insert(5, ',');
	System.out.println("sb5.insert(5, ',') : "+sb5);	//처음으로 받은 index의 주소에 다음 문자, 문자열을 삽입한다.
		System.out.println("sb5.substring(7) : "+sb5.substring(7));	//해당 index부터 문자열 반환
	
	
	
}
}
