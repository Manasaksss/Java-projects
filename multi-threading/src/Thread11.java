
public class Thread11 extends Thread {
	
		Table table;
	public Thread11(Table table) {
		this.table = table;
	}
	public void run() {
		table.getTable(11);
		
	}
	}

