package JustRunJava;
	//가변인수
	//
public class Code054 {
	public static void varArg(int ...v) {
		
		System.out.println("numver of arguments :"+v.length);
		for(int i=0;i<v.length;i++) {
			System.out.println(v[i]);
		}
	}
	public static void main(String[] args) {
		varArg();
		varArg(1);
		varArg(5,10);
		varArg(2,3,45);
		
	}
}
