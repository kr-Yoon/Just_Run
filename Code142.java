package JustRunJava;
	//�÷��� �����ӿ�ũ List �������̽�
	//�迭��ü�� �޸� Size(length)�� �����Ǿ����� �ʴ�.
	//���ͷ� ���� �ƴ�, �������� ������ �� �ִ�.
	
import java.util.ArrayList;

public class Code142 {

	public static void main(String[] args) {
		ArrayList<String> listTest = new ArrayList<String>();
		listTest.add("Yoon");
		listTest.add("sang");
		listTest.add("hyun");
		  
		for(int i=0; i<listTest.size();i++) {
			System.out.println(listTest.get(i));
		}
	}
}
