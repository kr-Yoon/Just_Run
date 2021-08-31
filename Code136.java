package JustRunJava;
import java.io.FileOutputStream;
import java.io.IOException;

public class Code136 {
	public static void main(String[] args) {
		String content = "Hellow java programmers";
		byte[] bytes = content.getBytes();
		FileOutputStream fos = null;
		
		
		try {
			fos=new FileOutputStream("data4.txt");
			fos.write(bytes);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			}
			catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
