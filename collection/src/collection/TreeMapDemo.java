package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> hashMap = new TreeMap<>();
		hashMap.put("india", "new delhi");
		hashMap.put("china", "beijing");
		hashMap.put("usa", "washington");
		hashMap.put("australia", "canberra");
		hashMap.put("turkey", "ankara");
		
		System.out.println(hashMap);
		

	}

}
