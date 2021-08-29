package JustRunJava;
	//확장 for문_for-each 반복문
	//for(변수 : 배열) {처리구문} == 변수에 배열의 원소들을 하나씩 대입해 처리구문을 실행.
	//단, 변수는 배열과 동일한 자료형이여야 한다.
public class Code045 {

	public static void main(String[] args) {
		int data[] = new int[] {10,20,30,40,50};
		for(int a:data) {
			System.out.println(a);
		}
	}
}
 