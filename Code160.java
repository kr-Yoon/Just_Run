package JustRunJava;
//�迭�� ����Ʈ
import java.util.ArrayList;

public class Code160 {

	public static void main(String[] args) {
		//�迭(Array)�� ���̰� �������̴�
		String a[] = {"a", "b"};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//ArrayList�� ���̰� �������̸�, �ε��� �� ������ �����Ӵ�
		ArrayList<String> b = new ArrayList<String>();
		b.add("a");
		b.add("c");
		b.add("d");
		System.out.println(b);
		
		b.add(1, "b");	//[1]index�� ���� "b" ����
		System.out.println(b);
		
		System.out.println(b.contains("c"));	//ArrayList b �ȿ� c�� �ִ��� ���θ� boolean Ÿ������ ��ȯ
		
		b.remove("d");	//ArrayList b �ȿ� "d"���ڸ� ����, �ش��ϴ� ���� ���ٸ� �۵� ����(���ܹ߻� ����)
		System.out.println(b);
		
		b.remove(2);	//ArrayList b �� [2]�ε����� ����, �ش� �ε����� �ڷᰪ�� ���ٸ� ���ܹ߻�
		System.out.println(b);
		
	}
}
