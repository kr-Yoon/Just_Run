package Just_Run;
	//메소드가 배열을 반환하는 경우.
import java.util.Arrays;

public class Code30_7 {

	public static int[] update(int size) {	// 3) 인수 s를 size 매개변수로 대입
		int startArray[] = new int[size];	// 4) startArray 배열을 size length로 생성
		for(int i=0;i<startArray.length;i++) {
			startArray[i] = i*i;
		}
		return startArray;
	}
	public static void main(String[] args) {
		int s = 10;	// 1) 변수s에 int 10 리터럴 대입
		int fianlArray[] = update(s);	// 2) update 메소드 호출
		System.out.println(Arrays.toString(fianlArray));
	}
}
