package Multithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {


		MyThread thread1 = new MyThread(); //1st method to declare a thread(Create a subclass)
		
		MyRunnable runnable1 = new MyRunnable(); //2nd methods to declare a thread(Implement runnable Interface and pass as an argument to thread
		Thread thread2 = new Thread(runnable1);
		
	//	thread1.setDaemon(true);
	//	thread2.setDaemon(true);

		
		thread1.start();
		//thread1.join(3000); // 1thread follows other..doesn't run simultaneously if used
		thread2.start();
		
	
		
	
	}

}
