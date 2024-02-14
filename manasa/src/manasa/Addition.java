package manasa;

public class Addition {
	void add(int x,int y) {
		System.out.println("add(int x,int y):"+(x+y));
	}
	void add(long x,long y) {
		System.out.println("add(long x,long y):"+(x+y));
	}
	void add(float x,float y) {
		System.out.println("add(float x,float y):"+(x+y));
	}
	void add(byte x,byte y) {
		System.out.println("add(byte x,byte y):"+(x+y));
	}
	void add(int...integers) {//varying arguments for n number of integers
		int sum = 0;
		for(int i:integers)
			sum+=i;
		System.out.println("add(int...integers):"+sum);
	}

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(2,3,5,8,10,9,56);
		// TODO Auto-generated method stub

	}

}
