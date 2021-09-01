package JustRunJava;

import java.util.HashSet;

public class Code150 {
	public static void main(String[] args) {
		Integer[] a = {1,2,4,1,3,2,1,2,1,4,3,1,2,4,1,2,4};
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i =0; i<a.length;i++) {
			set.add(a[i]);
			System.out.println(set);
		}
	}
}
