package Multithreading;

class deadlock  
{
	
	public void method()
	{
	String str1="java";
	String str2="c sharp";
	
			Thread t=new Thread()
			{
				public void run()
				{
					synchronized (str1)
					{
						System.out.println("Str1:");
						try
						{
							System.out.println("Waiting for 2....");
							Thread.sleep(10000);
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						synchronized(str2)
						{
							System.out.println("str1 that aquire the lock on str2");
						}
						
					}
				}
		
			};
			
		Thread T2=new Thread()
		{
			public void run()
			{
				synchronized(str2)
				{
					System.out.println("str2:");
				}
				try
				{
					System.out.println("Waiting for 1....");
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				synchronized(str1)
				{
					System.out.println("str2 aquire the lock on str1");
				}
			
			}
		
				
				
		};
		try
		{
			t.start();
			t.join();
			T2.start();
			T2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
		
}
public class DeadlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub(
		deadlock d=new deadlock();
		d.method();
		
		

	}

}
