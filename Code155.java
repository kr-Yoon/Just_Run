package JustRunJava;
class TestThread extends Thread{
	String name;
	TestThread(String name){
		this.name = name;
	}
	public void run() {
		System.out.println(name+" Starting!");
		try {
			for(int i=0;i<10;i++) {
				Thread.sleep(300);
				System.out.println("In "+name+" : "+i);
			}
		} catch(InterruptedException e) {
			System.out.println(e);
		}

		System.out.println(name+" terminating");
	}
}
public class Code155 {
	public static void main(String[] args) {
		System.out.println("main Straing!");
		Thread th = new Thread(new TestThread(" TestThread"));
		th.start();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(300);
				System.out.println("In main : "+i);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("main ending");
	}

}
