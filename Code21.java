package pro02;
	//for �ݺ��� for(�ʱ⹮;����;����)
public class Code21 {
	public static void main(String[] args) {
		int i;
		int sum = 0;	//�ʱ⹮ > ���� > ó�� > ���� > ���� >....��������x for�� �б�> 
		for (i=1;i<=10;i++) {
			sum += i;
		}
		System.out.println("sum : "+sum);
	}
}
