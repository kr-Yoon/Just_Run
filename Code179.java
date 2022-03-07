package JustRunJava;

public class Code179 implements Runnable{

class MyThread {
	private String threadName;
	public Code179(String threadName){
		this.threadName=threadName;
	}
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(threadName+":"+i);
		}
	}
}

public class ThreadTest {

	public static void main(String[] ar){
		System.out.println("MainThread Start");
		for(int i=1;i<=3;i++){
			Thread thread=new Thread(new Code179("Thread"+i));
			thread.start();
		}
    
    for(int i=1;i<=3;i++) {
			thread[i].join();
      }
    
		System.out.println("MainThread End");	
	}
	
}

}
