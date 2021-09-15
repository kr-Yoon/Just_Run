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
		
		StudentName s1 = new StudentName("윤상현", 1001);
		StudentName s2 = new StudentName("안유미", 1002);
		StudentName s3 = new StudentName("윤상혁", 1003);
		StudentName s4 = new StudentName("공미옥", 1004);
		
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
			
			System.out.println("계속 검색 하시겠습니까? (y/n)");
			allow = text.next();
			
			if (allow.equals("y")){
				System.out.println("학생 이름을 입력해 주세요 : ");
				quest = text.next();
				
				for (StudentName i:al) {
					if (i.getName().equals(quest)) {
						System.out.println(i.getName()+"학생의 학번은 "+i.getNo()+"입니다");
						flag = true;
						
						}
					}
				
				if (!flag) {
					System.out.println("일치하는 학생이 없습니다.");
					continue;
				}
				else 
					continue;
			
			}
			
			
			else
				System.out.println("프로그램을 종료합니다...");
				text.close();
				break;
					
		}
	}
}

