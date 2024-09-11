package Multithreading;

public class SleepMethodDemo extends Thread{
	
	public void run()
	{
		int ascii=65;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==j||i==5)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print((char)ascii++);
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
				
			}
			System.out.println();
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepMethodDemo h=new SleepMethodDemo();
		h.start();

	}

}
