package JustRunJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Code151 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("david", "qwer123");
		map.put("yoon", "abc101");
		map.put("auami", "ynno121");
		map.put("paul", "asdf1919");
		map.put("marry", "good!@#");
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		System.out.println("====================");
		
		for(Map.Entry<String, String> e : map.entrySet()) {
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key+" : "+value);
		}
	}

}
   