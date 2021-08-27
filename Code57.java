package pro05;
	//������
	//�������� ���߰Ե� ���, �ڽ�Ŭ���� ��ü �ɹ��� ����� �� ���µ�, if���� ���� ��������ȯ�� �� ��, ����� �� �ִ�.
class Boss{
	
	void test() {
		System.out.println("Boss  test method call");
	}
	void check() {
		System.out.println("only Boss check method call");
	}
}

class Slave1 extends Boss{
	
	void test() {
		System.out.println("Slave1 fix test method call");
	}
	
	void print() {
		System.out.println("only Slave1 print method call");
	}
	
}

class Slave2 extends Boss{
	void test() {
		System.out.println("Slave2 fix test method call");
	}
	
	void bang() {
		System.out.println("only slave2 bang method call");
	}
}


public class Code57 {

	static void doWork(Boss boss) {
		if(boss instanceof Slave1) {
			Slave1 x = (Slave1)boss;
			x.test();
			x.check();
			x.print();			
		}
		else if(boss instanceof Slave2) {
			Slave2 x = (Slave2)boss;
			x.test();
			x.check();
			x.bang();
		}
		else {
			boss.test();
			boss.check();
		}
		
	}
	

	public static void main(String[] args) {
		Boss test1 = new Boss();
		Slave1 test2 = new Slave1();
		Slave2 test3 = new Slave2();
		
		doWork(test1);
		System.out.println("----------------------------");
		doWork(test2);
		System.out.println("----------------------------");
		doWork(test3);
		
		
	}
}