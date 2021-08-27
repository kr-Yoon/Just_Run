package pro05;
	//�ν��Ͻ� ���� �ٸ� �ν��Ͻ� �ʵ带 ������ ��
	//Student Ŭ���� �Ű�������, Score Ŭ������ �μ��� �ް�, Score Ŭ������ �ʵ尪�� StudentŬ�������� ����, ���, ������ �����ϰ� ��.


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
