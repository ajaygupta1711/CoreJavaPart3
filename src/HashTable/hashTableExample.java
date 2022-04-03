package HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;

public class hashTableExample {

	public static void main(String[] args) {
		
		/* This is how to declare HashMap */
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		
	    /*Adding elements to HashMap*/
		hm.put(0, "Hello");
		hm.put(1, "Goodbye");
		hm.put(2, "Good Morning");
		hm.put(3, "Good Evening");
		
		System.out.println(hm.get(0));
		hm.remove(0);
		System.out.println(hm.get(0));
		System.out.println(hm.get(2));
		
	    /* Display content using Iterator*/
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		// hashtable - pass table set collections
		while(it.hasNext())
		{
//			System.out.println(it.next());
			Map.Entry mp=(Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}
}
