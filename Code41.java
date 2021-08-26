package pro04;
	//static Å°¿öµå
class Circle {
	static double PI = 3.141592;
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	double area() {
		return radius * radius * PI;
			}
	double perimeter() {
		return 2*PI*radius;
		
	}
}
public class Code41 {
	public static void main(String[] args) {
		Circle c1 = new Circle(100.0);
		Circle c2 = new Circle(1000.0);
		
		System.out.println(c1.area());
		System.out.println(c1.perimeter());
	
		
		System.out.println(c2.area());
		System.out.println(c2.perimeter());
	

		System.out.println(Circle.PI);
	}

}
