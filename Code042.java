package JustRunJava;
	//�迭 ����
import java.util.Arrays;

public class Code042 {

	public static void main(String[] args) {
		int array1[] = new int[] {1, 2, 3, 4, 5};
		int array2[];
		
		 
		array2 = array1;
		
		System.out.println("array1 : "+array1);	
		System.out.println("array2 : "+array2);	//array2 ���������� array1�� ���� �־��� ������ ������ �������� ��µȴ�.
		
		array2[2] = 100;
		
		System.out.println("array1 : "+Arrays.toString(array1));
	 	System.out.println("array2 : "+Arrays.toString(array2));	//array2�� array1�� �������� �����ϰ� ���⶧����, array1�� ��Ұ� ����Ǹ� �����ϰ� ����� ���� ��µȴ�.
	}
}
