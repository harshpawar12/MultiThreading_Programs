package Multithreading;

class prio extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("run1");
			Thread.currentThread().getPriority();
			Thread.currentThread().setPriority(NORM_PRIORITY);
		}
		
	}
}
class priority extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			Thread.currentThread().getPriority();
			Thread.currentThread().setPriority(MAX_PRIORITY);
		}
		
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prio p=new prio();
		p.start();
		priority p1=new priority();
		p1.start();
		
	

	}

}
