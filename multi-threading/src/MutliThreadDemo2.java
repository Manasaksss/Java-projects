
public class MutliThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();
		Thread thread1 = new Thread(t1);
		thread1.setName("manasa");
		Thread2 t2 = new Thread2();
		Thread thread2 = new Thread(t2);
		thread2.setName("madhu");
		thread2.start();
		thread2.join();
		thread1.start();
	}

}
class Thread1 implements Runnable{

	@Override
	public void run() {
	for(int i = 1;i<10;i++)
		System.out.println(Thread.currentThread().getName()+":"+i);//thread is class name so left sid value will be static method
		
	}
	
}
 class Thread2 implements Runnable{
    @Override
	public void run() {// Thread1 add unimplement method
		 for(int k = 20;k<30;k++)
	System.out.println(Thread.currentThread().getName()+":"+k);	 
		
		
	}
	
}
