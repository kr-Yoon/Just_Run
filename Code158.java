package JustRunJava;
// StringBuffer ����
// StringBuffer�� ���ڿ��� ����, ������ �����Ӵ�
// StringBuffer�� String ��ü�� ���� ���̰� �޸� �Ҵ絵 ����. �� �ؽ��ڵ带 ������ ä ���ڿ��� �����۾��� �ʿ��Ұ�츸 ����
public class Code158 {
	public static void main(String[] args) {
		StringBuffer testb = new StringBuffer();
		testb.append("hello");
		System.out.println("testb ��ü�� �ؽ��ڵ� : " + System.identityHashCode(testb));
		testb.append(" ");
		System.out.println("testb ��ü�� �ؽ��ڵ� : " + System.identityHashCode(testb));
		testb.append("world");
		System.out.println("testb ��ü�� �ؽ��ڵ� : " + System.identityHashCode(testb));
		
		System.out.println(testb);
		System.out.println("testb ��ü�� �ؽ��ڵ� : " + System.identityHashCode(testb));
		// �ѹ��� testb ��ü�� ���� ��, �� �߰� = ���� �����ּҸ� ���´�.
		
		String tests = "";
		System.out.println("tests ��ü�� �ؽ��ڵ� : " + System.identityHashCode(tests));
		tests += "hello";
		System.out.println("tests ��ü�� �ؽ��ڵ� : " + System.identityHashCode(tests));
		tests += " ";
		System.out.println("tests ��ü�� �ؽ��ڵ� : " + System.identityHashCode(tests));
		tests += "world";
		System.out.println("tests ��ü�� �ؽ��ڵ� : " + System.identityHashCode(tests));
		
		System.out.println(tests);
		System.out.println("tests ��ü�� �ؽ��ڵ� : " + System.identityHashCode(tests));
		// tests ��ü�� ���Ῥ���ڸ� ����� ��� ���ο� String��ü�� �����ǰ�, �ش� �����ּҰ� tests�� ��ȯ�ȴ�
	}
}

