
public class Aa {
	private int x = 2;
	protected int y=5;
	int z=7;
	public int k = 9;
}
class Bb extends Aa{}
class InheritanceTest2{
	public static void main(String[] args) {
		Bb b=new Bb();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		System.out.println(b.k);
		
	}

}
