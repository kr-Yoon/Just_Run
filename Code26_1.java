package Just_Run;
	//1차원 배열
	//1차원 배열 선언시 한 문장에서 초기화를 진행할 경우, 좌항에 int[] 가 있기 때문에 우항에 new int[]를 기입하지 않아도 자동기입된다.
	//아래 예시에서의 score 참조변수는 4byte의 공간을 할당받아 
	//new 연산자가 대입연산을 통해 {}의 index 0의 주소를 score에 대입한다.

public class Code26_1 { 

	public static void main(String [] args) {
		
		int score[] = new int[] {90,85,92,75,88};
		
		for(int i=0; i<score.length ; i++) {
			System.out.println("score ["+i+"] = "+score[i]);
		}
		
		
		
		
		
		
		
		
		
	}
}
