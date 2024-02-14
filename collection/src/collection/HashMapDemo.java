package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> hashMap = new HashMap<>();
		hashMap.put("india", "new delhi");
		hashMap.put("china", "beijing");
		hashMap.put("usa", "washington");
		hashMap.put("australia", "canberra");
		hashMap.put("turkey", "ankara");
		
		System.out.println(hashMap);
		
	}

}
