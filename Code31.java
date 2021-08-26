package Just_Run;

public class Code31 {
	
	public static int largerThanA(int A, int ...v) {
		int sum=0;
		for(int i=0;i<v.length;i++) {
			if(v[i] >= A)
				sum += v[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
				
		
		int x = largerThanA(5,50,50,50,50,50,5,05,0,50);
		
		System.out.println("larger Than First number is : "+x);
		
	}
}
