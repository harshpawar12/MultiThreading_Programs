package Multithreading;

class waiting extends Thread
{
	int p=0;
	public void run()
	{
		synchronized (this)
		{
			
			for(int i=1;i<=5;i++)
			{
				p=i*1000;
			}
			this.notifyAll();
			
		}
		
	}
}
public class WaitNotify {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		waiting w=new waiting();
		
		
		synchronized (w) {
			w.start();
			w.wait();
		}
		
		System.out.println("total is:"+w.p);
		System.out.println("main completed.....");

	}

}
