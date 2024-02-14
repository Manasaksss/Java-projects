
public class Thread22 extends Thread {
	Table table;
	public Thread22(Table table) {
		this.table = table;
		
	}
	public void run() {
		table.getTable(22);
	}

}
