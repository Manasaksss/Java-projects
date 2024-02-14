package sunday;

public class IntegerDemo {
   
	public static void main(String[] args) {
	int i = 20;
	Integer integer = i;
	System.out.println(integer.toBinaryString(i));
	int x = 6,y = 5,z=6;
   System.out.println(Integer.max(integer.max(x,y),z));
   System.out.println(Integer.min(integer.min(x,y),z));
   System.out.println(Integer.sum(integer.sum(x,y),z));
	}
}

