package polymorphism;
public class InterfaceTest2 {

	public static void main(String[] args) {
		Predator predator = new Eagle();
		predator.hunt();
		Pray pray = new Rabbit();
	    pray.flee();
	    Predator predator2 = new Fish();
		predator2.hunt();
		Pray pray2 = new Fish();
	    pray.flee();
		}
}
