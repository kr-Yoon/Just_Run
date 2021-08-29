package JustRunJava;
	//캐스트 연산자 보충
public class Code021 {

	public static void main(String[] args) {
		
		byte bi, bj;
		int i = 100, j = 300;
		bi = (byte)i;	
		System.out.println("bi : "+bi);
		bj = (byte)j;  //일시적으로 j의 값을 byte화, byte가 표현할수 있는 값은 -128 ~ 127 이므로 허용범휘로 치환 후 표기
		System.out.println("bj : "+bj);
		
		byte b1 = 10, b2;
		int a = 5;
		b2 = (byte)(b1 + a);
		System.out.println("b2 : "+b2);
		

	}

}
