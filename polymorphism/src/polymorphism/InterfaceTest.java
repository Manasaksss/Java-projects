package polymorphism;

public class InterfaceTest {
public static void main(String[] args) {
		MyInterface1 obj =  new MyInterfaceImp();//obj->ref var,Myinterface->super interface type,new->keyword,MyInterfaceImp->childclass costructor
		obj.foo();
		obj.bar();
		MyInterface1.print();

	}

}
