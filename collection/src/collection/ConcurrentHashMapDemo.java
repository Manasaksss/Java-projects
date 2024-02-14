package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String,String> hashMap = new ConcurrentHashMap<>();
		hashMap.put("india", "new delhi");
		hashMap.put("china", "beijing");
		hashMap.put("usa", "washington");
		hashMap.put("australia", "canberra");
		hashMap.put("turkey", "ankara");
		
		System.out.println(hashMap);
		

	}

}
