
package JustRunJava;
	//Ŭ����, Ŭ������ �ʵ�/�޼ҵ�/�����ڸ� �̷��.
	//�����ڸ� ��������� �������� ������ �ڵ������ȴ�.

class Car {	//���̺귯�� Ŭ����, ������ ������ �� �� ���� Ŭ����.
	
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




public class Code057 {	//Ȱ�� Ŭ����, ������ ���� ����.

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
		
		System.out.println("mycar �������� �ּ� : "+mycar);
		System.out.println("yourcar �������� �ּ� : "+yourcar);
		
		yourcar = mycar;
		
		System.out.println("mycar �������� �ּ� : "+mycar);
		System.out.println("yourcar �������� �ּ� : "+yourcar);

	}
}
