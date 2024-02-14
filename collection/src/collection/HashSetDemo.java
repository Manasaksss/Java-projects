package collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("hello");
		hashSet.add("who");
		hashSet.add("hi");
		hashSet.add("howdy");
		hashSet.add("howdy");
		hashSet.add("howdy");
		System.out.println("After Inserting Elements Is hashSet empty?"+hashSet.isEmpty());
		
		
		System.out.println(hashSet);
		System.out.println("Size :" +hashSet.size());
		System.out.println("------After clear() operation------");
		hashSet.clear();
		System.out.println("Size :" +hashSet.size());
		System.out.println("After clearing Elements,Is hashSet empty?"+hashSet.isEmpty());
		
		
		
	}

}
