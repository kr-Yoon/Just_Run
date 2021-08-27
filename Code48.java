package pro05;
	//인스턴스 내에 다른 인스턴스 필드를 가지는 예
	//Student 클래스 매개변수에, Score 클래스를 인수로 받고, Score 클래스의 필드값을 Student클래스에서 수정, 출력, 연산이 가능하게 함.


class Score{
	private int math, english;
	
	Score() {}
	Score(int math, int english){
		this.math = math;
		this.english = english;
	}
	
	int getMath() {
		return math;
		}
	int getEnglish() {
		return english;
	}
	void setMath(int math) {
		this.math = math;
	}
	void setEnglish(int english) {
		this.english = english;
}
	void incMath(int math) {
		this.math += math;
	}
	void incEnglish(int english) {
		this.english += english;
	}
}

class Student2{
	private String name;
	private Score score;
	
	Student2() {}
	Student2(String name, Score score){
		this.name = name;
		this.score = score;
	}
	
	String getName() {
		return name;
	}
	Score getScore() {
		return score;
	}
	void setName(String name) {
		this.name = name;
	}
	void setScore(Score score) {
		this.score = score;
	}
	void setEnglishScore(int english) {
		score.setEnglish(english);
	}
	void setMathScore(int math) {
		score.setMath(math);
	}
	void incScore(int math, int english) {
		score.incMath(math);
		score.incEnglish(english);
	}
	void print() {
		System.out.println("Student ["+name+"' Score] Math : "+score.getMath()+" English : "+score.getEnglish());
	}
}

public class Code48 {
	public static void main(String[] args) {
		
		Student2 t1 = new Student2("yoon", new Score(100,100));
		
		Student2 t2 = new Student2();
		t2.setName("Y");
		t2.setScore(new Score(1000,1000));
		
		t1.print();
		t2.print();
		
		t1.setName("Sanghyun");
		t2.incScore(200, 200);
		
		t1.print();
		t2.print();
		
		t1.setEnglishScore(70);
		t2.setEnglishScore(30);
		t2.setMathScore(60);
		
		t1.print();
		t2.print();
		
		
	}
	

}
