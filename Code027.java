package JustRunJava;
	//for 반복문 for(초기문;조건;증감)
public class Code027 {
	public static void main(String[] args) {
		int i;
		int sum = 0;	//초기문 > 조건 > 처리 > 증감 > 조건 >....조건충족x for문 분기> 
		for (i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("sum : "+sum);
	}
}
