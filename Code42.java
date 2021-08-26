package pro04;
	//static ¸Þ¼Òµå
class Person{
	static int count;
	String name;
	
	Person() {
		count++;
	}
	
	static void printCount() {
		System.out.println("Person : "+count);
	}
}
public class Code42 {
	public static void main(String[] args) {
		Person.printCount();
//		Person p1 = new Person();
//		Person p2 = new Person();
//		Person p3 = new Person();
		Person.printCount();
		
	}

}
