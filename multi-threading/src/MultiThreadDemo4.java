
public class MultiThreadDemo4 {

	public static void main(String[] args) {
		Table table = new Table();
		
		Thread11 t11 = new Thread11(table);
		
		Thread22 t22 = new Thread22(table);
		
		t11.start();
		t22.start();
		
		
	}

}
