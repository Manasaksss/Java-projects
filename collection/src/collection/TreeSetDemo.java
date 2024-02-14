package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String>treeSet = new TreeSet<>();
		treeSet.add("azra");
		treeSet.add("neha");
		treeSet.add("puja");
		treeSet.add("zeba");
		treeSet.add("reshma");
		treeSet.add("tanya");
		treeSet.add("sara");
		treeSet.add("babita");
		treeSet.add("mamtha");
		treeSet.add("manasa");
		
		treeSet.forEach(System.out::println);
		
		Set<Integer> integers = new TreeSet<>();
		integers.add(5000);
		integers.add(1000);//int->integer
		integers.add(10);
		integers.add(100);
		integers.add(200);
		integers.add(500);
		integers.add(300);
		
		integers.forEach(System.out::println);
		
		
		

	}

}
