package pro05;
	//final 키워드
class Circle{
	final double PI = 3.14; 	//final 필드를 사용하여 고정.
	private double radius;
	
	Circle() {}
	Circle(double radius){
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	void area(Circle x) {
		double area = x.radius * x.radius;
		System.out.println("Area is : "+area);
		}
	
	void area() {
		double area = this.radius * this.radius * this.PI;
		System.out.println("Area is : "+area);
		}
	
}
public class Code54 {
	public static void main(String[] args) {
		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(2.2);
		
		c1.area();
		c2.area();
	}

}
