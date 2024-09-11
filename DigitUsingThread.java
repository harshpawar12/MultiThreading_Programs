package Multithreading;

class Digitsum
{
		public static synchronized void add(int start,int end)
		{
		int sum=0;
		for(int i=start;i<end;i++)
		{
			sum+=Character.getNumericValue(DigitUsingThread.no.charAt(i));
			

		}
		System.out.println(sum);

		DigitUsingThread.sum+=sum;
		
		System.out.println(Thread.currentThread().getName());
	}
}
public class DigitUsingThread extends Thread {
	
	static String no="12345678";
	static  int sum=0;
	int start,end;
	DigitUsingThread(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		Digitsum.add(start, end);
	}

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		
		 int mid = no.length() / 2;
	        
	        DigitUsingThread t1 = new DigitUsingThread(0, mid);
	        DigitUsingThread t2 = new DigitUsingThread(mid, no.length());
	        t1.start();
	        t1.join();
	        t2.start();
	        t2.join();
			System.out.println(DigitUsingThread.sum);

	        

		
		

	}

}
