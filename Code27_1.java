package pro03;
	//2차원 배열 만들기. data1과 data2는 동일한 결과를 만든다.
	//

public class Code27_1 {

	public static void main(String[] args) {
		
		int[][] data1 = new int[3][4];
		data1[0][0] = 1;
		data1[0][1] = 2;
		data1[0][2] = 3;
		data1[0][3] = 4;
		data1[1][0] = 5;
		data1[1][1] = 6;
		data1[1][2] = 7; 
		data1[1][3] = 8;
		data1[2][0] = 9;
		data1[2][1] = 10;
		data1[2][2] = 11;
		data1[2][3] = 12;
		
		int[][] data2 = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		
		System.out.println(data1[1][2]);
		System.out.println(data2[1][2]);
		

	}

}
