package JustRunJava;
// �ڹ� �˰��� ���� 100_2 �Ǻ���ġ ����
import java.util.Scanner;

public class Code164 {

 static int Fibo(int num){
		
		if(num <= 1) {
			int result = 1;
			return result;
		}
		
		else if (num >= 2) {
			int result = Fibo(num-1) + Fibo(num-2);
			return result;
		}
		
		else
			return 0;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		for(String answer="y";answer.equals("y");i++) {
				
			System.out.println("�Ǻ���ġ ���� "+(i+1)+" ��° : ["+Fibo(i)+"]");
			
			System.out.println("���� ����� ���ðڽ��ϱ�? (y/n)");
			answer = sc.next();
		}
		System.out.println("�Ǻ���ġ ������ �����մϴ�..");
		sc.close();

	}

}
