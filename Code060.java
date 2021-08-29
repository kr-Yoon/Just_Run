package JustRunJava;
	//디폴트 생성자가 있는 클래스
class Dog1{
	
	String name = "싸리";
	String color = "흰색";
	
	Dog1() {
		System.out.println("디폴트 생성자가 호출되었습니다.");
	}
	
	void printDog() {
		System.out.println("개의 이름은 "+name+" 색깔은 "+color+"입니다.");
		}
	

	
}
public class Code060 {
	public static void main(String[] args) {
		Dog1 x = new Dog1();
		x.printDog();
	}
 
}
