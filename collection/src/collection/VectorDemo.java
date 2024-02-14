package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();//Vector is a raw type.
		//References to generic type Vector<E> 
		//should be parameterized
		vector.add("hi");
		vector.add("hello");
		Vector<Integer> integers = new Vector<>();
		integers.add(200);
		integers.add(Integer.valueOf(100));
		
		Vector<Boolean> booleans = new Vector<>();
		booleans.add(Boolean.valueOf(false));
		
		Vector<Emp> emps = new Vector<>();
		emps.add(new Emp(12,"rama","rama@e.com"));
		
		Enumeration<String> enumeration =  vector.elements();
		System.out.println(vector);
		
		while(enumeration.hasMoreElements()) {
		String string = enumeration.nextElement();
		System.out.println(string.toUpperCase());
		System.out.println(enumeration.nextElement());
		
	}

}
}