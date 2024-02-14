package collection;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> strings = new LinkedList<>();
		
		strings.add("hello");
		strings.add("how");
		strings.add("you");
		
	   Iterator<String> iterator = strings.iterator();
	   while(iterator.hasNext())
	   System.out.println(iterator.next().toUpperCase());
		strings
		.stream()
		.map(str-> str.toUpperCase())
		.forEach(System.out::println);
	   
		LinkedList<Emp> emps = new LinkedList<>();
		emps.add(new Emp(11,"AA","aa@email.com"));
	}

}
