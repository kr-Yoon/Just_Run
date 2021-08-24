package pro02;
	//논리연산자 A&&B 논리 곱, A||B 논리 합, !A 논리 부정

public class Code12 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 15;
		boolean b1 = a>b && c>d;	// &&는 논리 곱(and)이기 때문에 첫 대소비교 연산자가 거짓이기에 그담은 연산을 진행하지 않고 거짓을 돌려준다.
		boolean b2 = a!=b || b>c;
		boolean b3 = a<=b || c<=d;	// ||는 논리 합(or)이기 때문에 첫 연산자의 값이 거짓이어도 다음 연산을 확인한다.
		System.out.println(b1 + " " +b2+ " " +b3);
	}
}
