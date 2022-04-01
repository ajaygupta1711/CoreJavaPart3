package ArrayListCollection;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ajay");
		a.add("Java");
		a.add("Java");
		a.add("Aarav");
		System.out.println(a);
		
		System.out.println(a.indexOf("Ajay"));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
	}

}
