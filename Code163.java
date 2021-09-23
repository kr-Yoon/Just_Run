package JustRunJava;

import java.util.ArrayList;
import java.util.Scanner;

class StudentName {
	String name;
	int no;
	StudentName(String name, int no){
		this.name = name;
		this.no = no;
	}
	
	String getName() {
		return this.name; 
	}
	
	int getNo() {
		return this.no; 
	}
		
}
public class Code163 {
	
	public static void main(String[] args) {
		
		StudentName s1 = new StudentName("������", 1001);
		StudentName s2 = new StudentName("������", 1002);
		StudentName s3 = new StudentName("������", 1003);
		StudentName s4 = new StudentName("���̿�", 1004);
		
		ArrayList<StudentName> al = new ArrayList<StudentName>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		String allow;
		String quest;
		  
		
		Scanner text = new Scanner(System.in);
		
		while(true) {
			boolean flag = false;
			
			System.out.println("��� �˻� �Ͻðڽ��ϱ�? (y/n)");
			allow = text.next();
			
			if (allow.equals("y")){
				System.out.println("�л� �̸��� �Է��� �ּ��� : ");
				quest = text.next();
				
				for (StudentName i:al) {
					if (i.getName().equals(quest)) {
						System.out.println(i.getName()+"�л��� �й��� "+i.getNo()+"�Դϴ�");
						flag = true;
						
						}
					}
				
				if (!flag) {
					System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
					continue;
				}
				else 
					continue;
			
			}
			
			
			else
				System.out.println("���α׷��� �����մϴ�...");
				text.close();
				break;
					
		}
	}
}

/* 
�ٸ� Ǯ�� (��Ʃ�� Ǯ��)

package _1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student st1 = new Student("�տ���", "1682");
		Student st2 = new Student("���Ȱ�", "1772");
		Student st3 = new Student("�����", "1813");
	
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for (Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		
		Scanner scan = new Scanner(System.in);
		

		while (true) {
			System.out.println("��� �˻��� �ϰ�����ø� y, �����ϰ������ n");
			String input = scan.next();	
			
			if (input.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");
				String name = scan.next();
				boolean flag = false;
				
				for (Student stu: list) {
					if (stu.getName().equals(name)) {
						System.out.println("�ش��ϴ� �л��� �й���:"+stu.getNo());
						flag = true;
					}
				}
				
				if (!flag) {
					System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
				}
				
				
			}
			else if (input.equals("n")) {
				break;
			}
			
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		
	}

}

*/
