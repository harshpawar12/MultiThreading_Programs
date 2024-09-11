package Multithreading;
class t1 extends Thread
{
	public void run()
	{
		System.out.println("Multithreaded...");
	}
}
public class MultTypes extends Thread {
	
	public void run()
	{
		System.out.println("Thread Running....!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultTypes h=new MultTypes();// 1)single tast single Way.
		MultTypes h1=new MultTypes();

		h.start();
		h1.start();//2)single task with mult way.
		
		t1 n=new t1();
		n.start();// mult task using mult Thread.

	}

}
