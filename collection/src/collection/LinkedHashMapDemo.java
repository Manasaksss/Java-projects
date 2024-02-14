package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,String> hashMap = new LinkedHashMap<>();
		hashMap.put("india", "new delhi");
		hashMap.put("china", "beijing");
		hashMap.put("usa", "washington");
		hashMap.put("australia", "canberra");
		hashMap.put("turkey", "ankara");
		
		System.out.println(hashMap);
		
	}


	}

