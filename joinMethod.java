package Multithreading;
class pall extends Thread
{
	public void run()
	{
		System.out.println("Pellindrom seris:");
		for(int i=1;i<=30;i++)
		{
			int rem=0,rev=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(rev==i)
			{
				System.out.println(i+" ");
			}
		}
	}

}
public class joinMethod extends Thread{
	public void run()
	{
		System.out.println("prime seris:");

		for(int i=1;i<=30;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		joinMethod h=new joinMethod();
		pall p=new pall();
		
		try {
			h.start();
			
			h.join(); //join method are completed firt Execution next 2nd method.
			p.start();
			p.join();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
