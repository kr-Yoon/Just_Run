package JustRunJava;
	//final 키워드
class Circle12{
	final double PI = 3.14; 	//final 필드를 사용하여 고정.
	private double radius;
	
	Circle12() {}
	Circle12(double radius){
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	void area(Circle12 x) {
		double area = x.radius * x.radius;
		System.out.println("Area is : "+area);
		}
	
	void area() {
		double area = this.radius * this.radius * this.PI;
		System.out.println("Area is : "+area);
		}
	
}
public class Code079 {
	public static void main(String[] args) {
		Circle12 c1 = new Circle12(1.5);
		Circle12 c2 = new Circle12(2.2);
		
		c1.area();
		c2.area();
	}

}
