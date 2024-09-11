package Multithreading;

class red extends Thread
{
	public void run()
	{
		System.out.println("Red signal are StartAt 30sec");
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Yellow extends Thread
{
	public void run()
	{
		System.out.println("Yellow signal are StartAt 15sec");
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class green extends Thread
{
	public void run()
	{
		System.out.println("green signal are StartAt 30sec");
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class TrafficLight {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		red t=new red();
		Yellow t1=new Yellow();
		green g=new green();
		t.start();
		t.join();
		t1.start();
		t1.join();
		g.start();
		g.join();
		

	}

}
