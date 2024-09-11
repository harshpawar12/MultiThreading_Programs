package Multithreading;
/*
 * 3. Write a program that creates a thread that 
 * prints out "Hello, world!"
 every second for 10 seconds.
 */
public class SleepThreadEx1 extends Thread{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello World!");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThreadEx1 h=new SleepThreadEx1();
		h.start();
	}

}
