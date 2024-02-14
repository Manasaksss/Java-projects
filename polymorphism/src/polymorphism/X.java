package polymorphism;

public  abstract class X {
	abstract void foo();
	abstract void bar();
	void fooBar() {
		System.out.println("fooBar()");
		}
}//the type Y must implemented the inherited abstract 
class Y extends X{
	void foo() {
		System.out.println("foo()");
		}
	void bar() {
		System.out.println("bar()");
		}
	

}
