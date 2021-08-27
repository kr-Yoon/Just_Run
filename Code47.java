package pro05;
	//인스턴스 배열
	//객채를 생성하는 new 연산자로 생성되는 배열 역시도 객체이다.

	class Student1 {
		private String name;
		private int score;
		
		Student1(){}
		Student1(String name, int score) {
			this.name = name;
			this.score = score;
		}
		
		String getName () {
			return name;
		}
		int getScore () {
			return score;
		}
		void print() {
			System.out.println("name : "+name+" score : "+score);
		}
		
	}
public class Code47 {
	
	public static void main(String[] args) {
		
	
	Student1 t1[] = new Student1[5];	//student클래스 생성자를 통해 5 lenght의 배열객체 t1을 만들었다.
	t1[0] = new Student1("t1", 50);
	t1[1] = new Student1("t2", 60);
	t1[2] = new Student1("t3", 70);
	t1[3] = new Student1("t4", 80);
	t1[4] = new Student1("t5", 90);

	int total = 0;
	
	for(int i=0;i<t1.length;i++) {
		total += t1[i].getScore();
		}
	
	
	double avg = total / t1.length;
	
	System.out.println("Student avg is "+avg);
	
	
	}
}
