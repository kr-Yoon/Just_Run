package pro03;
import java.util.Arrays;
	//배열 복사
public class Code26_4 {

	public static void main(String[] args) {
		
		int[] oldArray = new int[] {1,2,3,4,5,6};
		int[] newArray = new int[] {10,20,30,40,50,60,70,80,90,100};
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(oldArray));
		
		System.arraycopy(oldArray, 0, newArray, 4, 5);
		
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(oldArray));
		
		 
		
		
	}
}
