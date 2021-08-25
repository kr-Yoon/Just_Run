package pro03;
	//다차원배열_가변배열
	//우선 행의 값을 지정한 뒤, 추가 배열을 선언하게되면 우선 지정된 행의 요소는 추가배열의 참조값을 갖게된다.
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
