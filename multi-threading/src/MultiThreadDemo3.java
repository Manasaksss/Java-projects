
public class MultiThreadDemo3 {
	public static void main(String[] args) {
		Thread3 t3 = new Thread3();
		Thread thread3 = new Thread(t3);
		thread3.setName("manasa");
		thread3.start();
		
	}
}
class Thread3 extends Thread{
	public void run() {
		for(int i = 0;i<100;i++) {
		try {
			Thread.sleep(5000);//it will help to set your thread to sleep mode
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+":"+i);
		
		}
	}
}
