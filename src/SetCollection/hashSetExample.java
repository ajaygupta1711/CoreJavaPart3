package SetCollection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		
// HashSet, TreeSet and LinkedHashSet implements Set interface
// Does not accept duplicate values		
// There is no guarantee elements stored in sequential order..Random order. That's why No Get(index) with this interface.
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("USA");
		hs.add("UK");
		hs.add("HE");
		hs.add("SHE");
		
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
	}
}