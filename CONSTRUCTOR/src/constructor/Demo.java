package constructor;

public class Demo {
	int x;
	int y;
	Demo(){
	System.out.println("demo constructor execute");
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.x = 11;
		demo.y = 22;
		System.out.println(demo.x);
		System.out.println(demo.y);
		
	}

}
