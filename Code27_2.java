package pro03;
	//�������迭_�����迭
	//�켱 ���� ���� ������ ��, �߰� �迭�� �����ϰԵǸ� �켱 ������ ���� ��Ҵ� �߰��迭�� �������� ���Եȴ�.
public class Code27_2 {

	public static void main(String[] args) {
		int data[][] = new int [3][];
		data[0] = new int [3];
		data[1] = new int [4];
		data[2] = new int [5];
		
				
		data[0][0] = 1; 
		data[0][1] = 2;
		data[0][2] = 3;
		data[1][0] = 4; 
		data[1][1] = 5;
		data[1][2] = 6;
		data[1][3] = 7;
		data[2][0] = 8;
		data[2][1] = 9;
		data[2][2] = 10;
		data[2][3] = 11;
		data[2][4] = 12;
		

		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.print("["+ data[i][j]+ "]");
			}
			System.out.println();
		}
	}
}
