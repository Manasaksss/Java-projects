package polymorphism;

public class A {
	void foo() {
		System.out.println("foo from A");
	}
}
class B extends A{
	void foo() {//without these 2 lines void and system o/p will be foo from A there is no method overriding
		System.out.println("foo from B");//it's called method overriding 
		}
	}
class InheritanceTest4{
	public static void main(String[] args) {
		B b =new B();
		b.foo();
	}
}
