package tuesday;

public class StaticDemo {
	static int x;
	{
		System.out.println("Real ise");	
	}
    static {
    	x=10;
    	System.out.println("Real Eyes");
    }
	public static void main(String[] args) {
		StaticDemo demo = new StaticDemo();
		System.out.println("Real Lies");
		System.out.println("x");
		
	}

}
