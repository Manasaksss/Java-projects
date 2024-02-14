package collection;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
    ArrayList<Emp> list = new ArrayList<>();
   
    Emp e1 = new Emp(101,"jo","jj@e.com");
    Emp e2 = new Emp(102,"yyg","jhn@e.com");
    Emp e3 = new Emp(103,"uig","jon@e.com");
    Emp e4 = new Emp(104,"hjyk","joh@e.com");
    Emp e5 = new Emp(105,"john","john@e.com");
    Emp e6 = new Emp(106,"hjyk","joh@e.com");
    Emp e7 = new Emp(107,"john","john@e.com");

    list.add(e1);
    list.add(e2);
    list.add(e3);
    list.add(e4);
    list.add(e5);
    list.add(1,e7);
    list.add(5,e6);
    
    // list.addAll()
    // list.addAll(0,list)
    ArrayList<Emp> list5 = new ArrayList<>();
    Emp e8 = new Emp(108,"ygj","fghk@e.com");
    Emp e9 = new Emp(109,"fdfg","dgjh@e.com");
    list5.add(e8);
    list5.add(e9);
    //list.addAll(list5);
    list.addAll(0,list5);
    
    //System.out.println("Emp at zero index :"+list.get(7));
    list.sort((o1,o2) ->{
    	if(o1.getEmpId() >o2.getEmpId())
    		return 1;
    	else if(o1.getEmpId() < o2.getEmpId())
    		return-1;
    	else
    		return 0;
    });
    
    
    list.forEach(System.out::println);
    System.err.println("-----------delete---------");
    list.remove(4);
    list.forEach(System.out::println);
    System.err.println("-----------remove by project name-----------");
    list.remove(e4);
    list.forEach(System.out::println);
    
    System.err.println("-----------remove collection of objects---------");
    ArrayList<Emp> list2 = new ArrayList<>();
    list2.add(e1);
    list2.add(e2);
    list.removeAll(list2);
    list.forEach(System.out::println);
    
    System.err.println("-----------remove by condition---------");
    list.removeIf(emp -> emp.getEmpId()==103);
    list.forEach(System.out::println);
    System.out.println("List Size : "+list.size());
		}

	}


