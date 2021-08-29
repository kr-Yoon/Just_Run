package JustRunJava;
	//메소드 매개변수로 배열을 넘기는 경우, 자료가 아닌 참조값(주소)를 인수로 보낸다.
import java.util.Arrays;
public class Code052 {

	
	static void update(int[] a) {
		for(int i=0;i<a.length;i++) {
			a[i] += 10;
		}
		
	}
	
	public static void main(String[] args) {
		int[] array1 = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(array1));
		update(array1);
		
		System.out.println(Arrays.toString(array1));
		
	}
}
