package Just_Run;
	//�޼ҵ尡 �迭�� ��ȯ�ϴ� ���.
import java.util.Arrays;

public class Code30_7 {

	public static int[] update(int size) {	// 3) �μ� s�� size �Ű������� ����
		int startArray[] = new int[size];	// 4) startArray �迭�� size length�� ����
		for(int i=0;i<startArray.length;i++) {
			startArray[i] = i*i;
		}
		return startArray;
	}
	public static void main(String[] args) {
		int s = 10;	// 1) ����s�� int 10 ���ͷ� ����
		int fianlArray[] = update(s);	// 2) update �޼ҵ� ȣ��
		System.out.println(Arrays.toString(fianlArray));
	}
}
