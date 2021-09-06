package JustRunJava;
	//이제껏 사용한 main 메소드는 메인 스레드이다.
	//새로운 스레드를 추가하여 사용하면 순차적 동작이 아닌, 각자 다발적으로 동작한다.
	//Thread 객체를 생성할 때, 재정의한 Thread 객체를 매개변수로 보내면, 같이 실행된다.
class NumberThread extends Thread {
	public void run() {
		for (int i=1; i<=26; i++) {
			System.out.print("["+i+"]");
		}
	}
}
public class Code153 {
	public static void main(String[] args) {
		Thread t = new NumberThread();
		t.start();
		for (char ch = 'A';ch <= 'Z'; ch++) {
			System.out.print("["+ch+"]");
		}
	}

}
   