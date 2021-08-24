package pro02;
	//시프트 연산자, 비트를 해당 괄호의 방향으로 이동. < == 곱셈 > == 나눗셈 2진수 이기때문에 2씩 곱함.
public class Code10 {

		public static void main(String[] args) {
			int x = 20;
			int a = 3;	//a는 비트의 이동 횟수를 의미한다. 즉 a==3 일경우 x 곱하기 2 를 세번 하는것
			int r1 = x<<a;	//
			System.out.println(r1);
			
		}
}
