package JustRunJava;
	//TreeSet
	//��Һ񱳰� ������ ���� ��밡���Ѥ��ϴ�.
import java.util.Iterator;
import java.util.TreeSet;

public class Code147 {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		int[] data = {1,6,4,9,8,2,3,7,5,10};
		for(int i=0;i<data.length;i++) {
			ts.add(data[i]);
		}
		
		System.out.println(ts);
		
		Iterator<Integer> it = ts.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
	
		
	}
}
