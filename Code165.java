package JustRunJava;
// �ڹٿ��� �ֺ�� ���ϱ�
// �������� ������ �ݺ����� ���� ��Ȳ�� ����� �߰� �ڵ� ����
// ��, �ݺ����� ���� ���� �ΰ��� �������� ǥ�Ⱑ��..���̻� ����� ������ ������ �ڹ� ���ص� ���ؿ����� �ܼ� �밡���̸�, �� �� ȿ������ ����� ����� �� �����Ұ�!

import java.util.Arrays;
import java.util.Random;

public class Code165 {
	public static void main(String[] args) {
		
		final int insert = 15;	// �Է°� �ڷ��� ���� ����
		final int num = 4;		// random ������ ���� �ִ밪 (0 ~ num) 
		// ������ ������ ����� �����Ӱ� ��� �����ϳ�, �ݺ����� �ߺ��� 2�������� ���������� ������ insert > num && insert != num*num && insert%num != 0 �� �ؼ��ϴ°��� ���Ѵ�.
		
		int max = 0;
		int height = 0;
		int height2 = -1;
		
		int[] values = new int[insert];
		int[] count = new int[num+1];
		
		Random random = new Random();
				

		// values �迭�� �� �ڵ�����
		for(int i=0;i<insert;i++) {
			values[i]=(random.nextInt(num+1));
			}
			
		// values �迭�� �� �� �ߺ����� count�� �Է�
		for(int i=0;i<insert;i++) {
			count[values[i]]++;
		}

		
		// �ִ밪 �� �ݺ� Ƚ�� Ȯ��
		for(int i=0;i<num+1;i++) {
			if (count[i]>max) {
				max = count[i];
				height = i;
			}
		}
		
		// ���࿡ �߻��� �ݺ����� ���� ��츦 ���
		
		for(int i=0;i<num+1;i++) {
			if (count[i]==max && i!=height) {
				height2 = i;				
			}
		}
		
			
		System.out.println("���� �� values �� �� : "+Arrays.toString(values));
		
		if (height!=height2 && height2 != -1) {
			System.out.println("���� ���� �ݺ��� ���� ["+height+" , "+height2+"] �̸�, values �迭 �ȿ� ["+max+"]���� �ֽ��ϴ�.");
			}
		else
			System.out.println("���� ���� �ݺ��� ���� ["+height+"] �̸�, values �迭 �ȿ� ["+max+"]���� �ֽ��ϴ�.");
	}
}

/* 
�ٸ� Ǯ�� (��Ʃ�� Ǯ��)

package _3_mode;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int []inputNum = new int[10];
		for (int i=0; i<10 ; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		//����� input

		//1 2 2 3 1 4 2 2 4 3
		
		// 1: 2
		// 2: 4  --> �ֺ��
		// 3: 2
		// 4: 2
		
		int []mode = new int [10];
		
		// index -> ������ ��
		// index �� -> index(�����Ѽ�)�� ������Դ��� �����ϴ� �뵵 
		
		// "mode[3] = 5, => 3�����ڰ�, 5�� �����ߴ�"
		
		
		//inputNum => 1 2 2 3 1 4 2 2 4 3
		for (int i=0; i<10 ; i++) {
			  mode[inputNum[i]]++;  
		}
		 //mode[1] == 2
		 //mode[2] == 4
		 //mode[3] == 2
		 //mode[4] == 2
		
		
		int modeNum = 0; //�ֺ�� 
		int modeCnt = 0; //�ֺ���� ����Ƚ��
		
		for (int i=0; i<10 ; i++) {
			if (modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("�ֺ����:"+modeNum+" cnt:"+modeCnt);
		
	}

}

*/