package Multithreading;

public class DeadLockEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String str1="hello";
		String str2="java";
		Thread t1=new Thread()
		{
			public void run()
			{
				System.out.println("thread 1 aquire resurce 1...");
				synchronized (str1) {
					
					try
					{
						System.out.println("Waiting for resources 2");
						Thread.sleep(2000);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
				synchronized (str2)
				{
					System.out.println("Thread 1 aquire resource 2");
				}
			}
		};
		Thread t2=new Thread()
		{
			public void run()
			{
				System.out.println("thread 2 aquire resurce 2...");
				synchronized (str2) {
					try 
					{
						System.out.println("Waiting for resources 1");

						Thread.sleep(2000);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
				synchronized (str1) {
					System.out.println("Thread 2 aquire resource 1");
				}
			}
		};
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		

	}

}
