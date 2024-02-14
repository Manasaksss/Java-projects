package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		Set<Emp1> emps1 = new TreeSet();
		
		Emp1 e1 = new Emp1(110,"abc","abc@email.com");
		Emp1 e2 = new Emp1(111,"vbc","abc@email.com");
		Emp1 e3 = new Emp1(112,"nbc","abc@email.com");
		Emp1 e4 = new Emp1(113,"kbc","abc@email.com");
		Emp1 e5 = new Emp1(114,"lbc","abc@email.com");
		Emp1 e6 = new Emp1(115,"klbc","abc@email.com");
		Emp1 e7 = new Emp1(116,"nmc","abc@email.com");
		Emp1 e8 = new Emp1(117,"fbc","abc@email.com");
		Emp1 e9 = new Emp1(118,"ybc","abc@email.com");
		Emp1 e10 = new Emp1(119,"hbc","abc@email.com");
		
		emps1.add(e10);
		emps1.add(e9);
		emps1.add(e8);
		emps1.add(e7);
		emps1.add(e6);
		emps1.add(e5);
		emps1.add(e4);
		emps1.add(e3);
		emps1.add(e2);
		emps1.add(e1);
		
		System.out.println(emps1.size());
		emps1.forEach(System.out::println);
		
	}

}
