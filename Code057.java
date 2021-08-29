
package JustRunJava;
	//클래스, 클래스는 필드/메소드/생성자를 이룬다.
	//생성자를 명시적으로 선언하지 않으면 자동생성된다.

class Car {	//라이브러리 클래스, 스스로 행위를 할 수 없는 클래스.
	
	String color;
	String kind;
	int year;
	
	void run() {
		System.out.println(color+kind+"car is running");	
	}
	
	void speedUp() {
		System.out.println(color+kind+"car is speeding up");
	}
}




public class Code057 {	//활용 클래스, 행위를 먼저 실행.

	public static void main(String [] args) {
		
		Car mycar = new Car();
		mycar.kind = "K7";
		mycar.color = "yellow";
		mycar.year = 2021;
		
		Car yourcar = new Car();
		yourcar.kind = "K9";
		yourcar.color = "yellow";
		yourcar.year = 2021;
		
		mycar.run();
		yourcar.run();
		
		mycar.speedUp();
		yourcar.speedUp();
		
		System.out.println("mycar 참조변수 주소 : "+mycar);
		System.out.println("yourcar 참조변수 주소 : "+yourcar);
		
		yourcar = mycar;
		
		System.out.println("mycar 참조변수 주소 : "+mycar);
		System.out.println("yourcar 참조변수 주소 : "+yourcar);

	}
}
