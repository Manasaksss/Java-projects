
public class MultiThreadDemo {

	public static void main(String[] args) {
		 MyThread myThread = new  MyThread();
		 myThread.setName("ME");
		 YourThread yourThread = new YourThread();
		 yourThread.setName("YOU");
		 yourThread.start();//call start method
		 myThread.start();

		 
	}

}
class YourThread extends Thread{
	public void run() {
		for(int j=10;j<20;j++)
			System.out.println(Thread.currentThread()
					.getName() +"j:" +j);
	}
	
}
class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=1;i<10;i++)
			System.out.println(Thread
			.currentThread()
			.getName() +"i:"+i);
	}
	
}
