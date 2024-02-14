package encapsulation1;

public class Main {

	public static void main(String[] args) {
		car c = new car(null, 0, null);
		c.setName("abc");
		c.setPrice(10000);
		c.setTopSpeed("200kmph");
		
		System.out.println("Name:"+c.getName());
		System.out.println( "Price:"+c.getPrice());
		System.out.println("Topspeed:"+c.getTopSpeed());
		System.out.println("start after update");
		c.setPrice(500000);
		c.setTopSpeed("250kmph");
		System.out.println("Name:"+c.getName());
		System.out.println( "Price:"+c.getPrice());
		System.out.println("Topspeed:"+c.getTopSpeed());
	}

}
