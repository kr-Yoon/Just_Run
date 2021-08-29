package JustRunJava;
	//do...while 반복문 
	//기존 반복문과 달리 do안에 들어가는 처리문을 1회 실행 후, while의 조건에 충족할경우 do를 반복, 아닐경우 분기.
public class Code028 {

	public static void main(String[] args) {
		int a = 1;
		do {
			System.out.println("Hello World");
			a ++;
		} while ( a<=5);
		
	}
}
