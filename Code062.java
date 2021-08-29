package JustRunJava;
	//생성자 오버로딩.
class Student{
	String name;
	int no;
	double score;
	
	Student () {}
	Student (int x) {
		no = x;
	}
	
	void printStudent() {
		System.out.println("no : "+no+" name : "+name+" score : "+score);
	}
}

public class Code062 {

	public static void main(String[] args) {
		Student first = new Student();
		Student scoend = new Student(2);
		
		first.printStudent();
		scoend.printStudent();
		
		first.name = "Y";
		first.no = 1;
		first.score = 100;
		
		scoend.name = "S";
		scoend.score = 90;
		
		first.printStudent();
		scoend.printStudent();
		
		
		
	}
}
