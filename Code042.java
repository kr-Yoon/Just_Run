package JustRunJava;
	//배열 대입
import java.util.Arrays;

public class Code042 {

	public static void main(String[] args) {
		int array1[] = new int[] {1, 2, 3, 4, 5};
		int array2[];
		
		 
		array2 = array1;
		
		System.out.println("array1 : "+array1);	
		System.out.println("array2 : "+array2);	//array2 참조변수에 array1의 값을 넣었기 때문에 동일한 참조값이 출력된다.
		
		array2[2] = 100;
		
		System.out.println("array1 : "+Arrays.toString(array1));
	 	System.out.println("array2 : "+Arrays.toString(array2));	//array2는 array1의 참조값을 동일하게 갖기때문에, array1의 요소가 변경되면 동일하게 변경된 값이 출력된다.
	}
}
