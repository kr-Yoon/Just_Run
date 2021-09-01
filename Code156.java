package JustRunJava;
	//¿­°ÅÇü
enum Cards{
	HEART, CLUB, SPADE, DIAMOND
}
public class Code156 {
	public static void main(String[] args) {
		Cards cd;
	
		System.out.println("print out all cards");
		Cards[] all = Cards.values();
		for (Cards c : all)
			System.out.println(c);
		
		cd = Cards.valueOf("CLUB");
		System.out.println(cd);
	}

}
