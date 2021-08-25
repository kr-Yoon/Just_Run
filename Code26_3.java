package pro03;
	//배열의 참조값
public class Code26_3 {
	public static void main(String[] args) {
		
		byte[] data_byte = new byte[3];
	 	System.out.println(data_byte);
		
		short[] data_short = new short[5];
		System.out.println(data_short);
		
		int[] data_int = new int[5];	//출력문에 배열명을 넣었을때 나오는 값이 참조값이며 앞의 I는 int 배열이라는 의미이다.
		System.out.println(data_int);
				
		long[] data_long = new long[7];
		System.out.println(data_long);
		
		float[] data_float = new float[7];
		System.out.println(data_float);
		
		double[] data_double = new double[7];
		System.out.println(data_double);
				
	}
}
