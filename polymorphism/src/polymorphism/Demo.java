package polymorphism;
public  abstract class Demo {
	int i;
	int j;
	Demo(int i){
		this.i=i;
	}
	Demo(int i,int j){
		this.i=i;
		this.j=j;
	}
	void foo() {
		System.out.println("foo from Demo :i" +i+ "j :"+j);
	}
	abstract void bar();//abstract method have no boby
}
class DemoChild extends Demo{

	public DemoChild(int i) {//short cut is right click ,source,generate super class
		super(i);
		}
	public DemoChild(int i,int j) {//short cut is right click ,source,generate super class
		super(i,j);
		}
	//CREATE A RESPECTIVE CONSTRUCTIOR
	@Override
	void bar() {
		System.out.println("Bar()");
		
	}
}
class AbstractTest{
	public static void main(String[] args) {
		Demo demo = new DemoChild(5);
		Demo demo2 = new DemoChild(2,3);
		
		//CREAT AN OBJECT BY CAlling TWO PARAMETERIZED CONSTRUCTION
		demo.foo();
		demo2.foo();
		}
}

