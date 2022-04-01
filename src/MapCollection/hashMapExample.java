package MapCollection;

import java.util.HashMap;

public class hashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "Goodbye");
		hm.put(2, "Good Morning");
		hm.put(3, "Good Evening");
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(4));
		
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("Test", "Hello1");
		h.put("Test1", "Goodbye1");
		
		System.out.println(h.get("Test"));
		System.out.println(h.get("Test1"));
	}

}
