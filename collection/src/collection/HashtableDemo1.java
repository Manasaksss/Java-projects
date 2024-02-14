package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo1 {

	public static void main(String[] args) {
		Hashtable<String,String> hashtable = new Hashtable<>();
	    hashtable.put("india", "new delhi");
	    hashtable.put("china", "beijing");
	    hashtable.put("usa", "washington");
	    hashtable.put("australia", "canberra");
		hashtable.put("turkey", "ankara");
		
		System.out.println(hashtable);
	}

}
