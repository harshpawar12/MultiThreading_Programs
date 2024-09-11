package Multithreading;


class synchro extends Thread 
{
	static int c=0;
	static int sum1=0;
	public static synchronized void isSum(String n)
	{
		int sum=0;
		int temp=0;
		for(int i=0;i<n.length()/2;i++)
		{
			sum+=Character.getNumericValue(n.charAt(c));
			System.out.println(n.charAt(c++));
			
		}
		System.out.println(sum);
		sum1+=sum;
		System.out.println(Thread.currentThread().getName());

		
	}
}
public class Synchonise extends Thread{
	
	static int sum=0;
	
	static String n;
	
	Synchonise(String n)
	{
		
		this.n=n;
	}
	public void run()
	{
		synchro.isSum(n);
	}
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		 String n="12345678";
	
	//System.out.println(mid);
		
		Synchonise s=new Synchonise(n);
		s.start();
		Synchonise s1=new Synchonise(n);
		s1.start();
		Thread.sleep(1000);
		System.out.println(synchro.sum1);

		
	}

}
