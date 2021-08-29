package JustRunJava;
	//매개변수는 있고, 반환값이 없는 경우
public class Code048 {

	public static void find(int x, int y) {
		int result = 1;
		for(int a=1; a<=y; a++) {
			result *= x;
		}
		System.out.println(x+"의 "+y+"승은 : "+result);
	}
	public static void main(String[] args) {
		
		int a=2, b=10;
		find(a,b);
			
	}
}
 