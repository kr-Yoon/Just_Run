package pro05;
	//�ν��Ͻ� �迭
	//��ä�� �����ϴ� new �����ڷ� �����Ǵ� �迭 ���õ� ��ü�̴�.

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
		
	
	Student1 t1[] = new Student1[5];	//studentŬ���� �����ڸ� ���� 5 lenght�� �迭��ü t1�� �������.
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
