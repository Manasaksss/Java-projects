
public class Table {
	
		public synchronized void getTable(int num) {
			{
				for(int i=1;i<=10;i++) {
					System.out.printf( "%d * %d = %d",num,i,(num * i));
					System.out.println();
				}
			}
		}

}
