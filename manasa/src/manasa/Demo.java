package manasa;

public class Demo {// class defined
	int x ;
	long y;
	Demo(){//zero.arg constructor defined
		System.out.println("Demo constructor Execute");
	}
	Demo(int x,int y){
		this.x = x;//this.x=int x
		this.y = y;//this.y=long y
		System.out.println("Demo(int x ,long y) Executed");
	}
	public static void main(String[] arg) {
		Demo demo = new Demo();
		demo.x = 11;
		demo.y = 12;
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println("------------demo2 object data-----------");
		Demo demo2 = new Demo(2,5);
		System.out.println(demo2.x);
		System.out.println(demo2.y);
		
	}

}
