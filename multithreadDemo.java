package Multithreading;

class mult extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i%2==0)
			{
			 System.out.println(i);
			}
		}
	}
}
public class multithreadDemo extends Thread {
	//Override
	 public void run()
	 {
		 for(int i=0;i<=5;i++)
		 {
			 if(i%2!=0)
			 {
				 System.out.println(i);
			 }
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multithreadDemo m=new multithreadDemo();
		m.start();
		mult h=new mult();
		h.start();
		
		System.out.println("main completed");
		
	}

}
