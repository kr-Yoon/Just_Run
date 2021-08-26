package pro04;
	//매개변수에도 클래스가 들어갈 수 있다.
class Point{
	private int x,y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	void setX(int x) {
		this.x = x;
	}
	void setY(int y) {
		this.y = y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	
	
}
public class Code46 {
	static void change(Point t) {
		t.setX(20);
		t.setY(100);
	}
	
	public static void main(String[] args) {
		Point p = new Point(2,10);
		System.out.println("befor x : "+p.getX()+" y : "+p.getY());
		change(p);
		System.out.println("after x : "+p.getX()+" y : "+p.getY());
		
	}
}
