package JustRunJava;
	//java.lang.String 
public class Code122 {
	public static void main(String[] args) {
		
		String str = new String("Java Programming");
		String temp = new String("Java Coding");
		String temp2 = new String("Study");
		String temp3 = new String("gram");
		
		
		
		System.out.println("str.charAt(5) : "+str.charAt(5));
		//매개변수로 받는 수의 해당하듣 문자열의 index 반환
		System.out.println("str.compareTo(temp) : "+str.compareTo(temp));
		//두 문자열의 index를 비교해가며 틀린 문자를 발견 시 유니코드의 차이 반환
		System.out.println("str.concat(temp2) : "+str.concat(temp2));
		//두 문자열을 붙여준다
		System.out.println("str.contains(temp3) : "+str.contains(temp3));
		//A문자열에 B문자, 문자열이 있는지 여부를 반환해준다.
		System.out.println("str.indexOf('P') : "+str.indexOf('P'));
		//문자열 앞에서부터 해당 문자, 문자열이 있는지 확인 한 뒤 index 반환
		System.out.println("str.indexOf('u') : "+str.indexOf('u'));
		//매개변수 값이 문자열에 없을경우 -1 반환
		System.out.println("str.lastindexOf('a') : "+str.lastIndexOf('a'));
		//문자열 뒤에서부터 해당 문자, 문자열을 확인 후 index 반환
		System.out.println("str.length() : "+str.length());
		//문자열의 물리적길이를 반환
		System.out.println("str.replace('a','A') : "+str.replace('a', 'A'));
		//문자열에 위치한 A문자를 B로 변환
		
		
		
		
		
		
		
		
	}

}
