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

