package Just_Run;
	//매개변수는 없고, 반환값이 있는 경우.
public class Code30_3 {

	public static int doSomething()
	{
		int result;
		result = 10*100;
		return result;
	}
	
	public static void main(String[] args) 
	{
		int x;
		x = doSomething();
		System.out.println("x : "+x);
		
	}
}
