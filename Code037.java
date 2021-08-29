package JustRunJava;
	//비트논리연산자_2진수 논리 &(and_곱) |(or_합) ^(Xor_다르면 참(1), 같으면 거짓(0))
public class Code037 {
	
	public static void main(String[] args) {
		int x = 11, y = 13;
		
		// 10진수 11의 2진수 표기시 1011
		// 10진수 13의 2진수 표기시 1101
		
		int a = x&y;
		System.out.println(a);
		// 2진수 표기법으로 곱, 참과 참의 곱은 참(1) 참과 거젓의 곱은 거짓(0) 거짓과 거짓의 곱은 거짓(0)
		
		
		int b = x|y;
		System.out.println(b);
		// 2진수 표기법으로 합, 참과 참의 합은 참(1) 참과 거젓의 합은 참(1) 거짓과 거짓의 합은 거짓(0)
		
		int c = x^y;
		System.out.println(c);
		// 2진수 표기법으로 Xor, 참과 참의 Xor은 거짓(0) 참과 거짓의 Xor은 참(1) 거짓과 거짓의 Xor은 거짓(0)
		
		
	}
}
