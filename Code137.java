package JustRunJava;
import java.io.FileWriter;
import java.io.IOException;
public class Code137 {
	public static void main(String[] args) {
		char[] cbuf = {'j', 'a', 'v','a'};
		String lang = "Language";
		FileWriter fos = null;
		
		try {
			fos = new FileWriter("data5.txt");
			fos.write(cbuf);
			fos.write("\n --------------------------------- \n");
			fos.write(lang);
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
