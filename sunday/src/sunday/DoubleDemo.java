package sunday;

public class DoubleDemo {

	public static void main(String[] arg) {
		try {
			try {
				System.out.println(10/0);//ARITHMETIC EXCEPTION
			}catch( NullPointerException e) {
					System.out.println(e.getMessage());
			}catch( ArithmeticException e) {
				System.out.println(e.getMessage());	
			}
			try {
				int[] a = {1,2,3,4,5};
				System.out.println(a[5]);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			}catch(Exception e) {
				System.out.println("Outer Exception is handled here");
					}finally {
						System.out.println("Finally Block Runs Always");
						System.out.println("Resource-file/socket/scanner/db");
						}
		}
}
