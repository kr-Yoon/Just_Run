package Just_Run;
	//continue 구문
	//반복문은 계속 시행하고싶으나, 중간에 빼고자 하는 값이 있을때 사용.
	//continue가 실행되면, continue와 끝 중괄호 까지의 코드를 무시한채, 조건으로 간다.
public class Code24 {

	public static void main(String[] args) {
		int a = 0;
		while (a<10)
		{ a++;
		if (a%3==0) continue;
		System.out.println(a);
		}
	}
}
