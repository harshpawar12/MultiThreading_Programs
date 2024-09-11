package Multithreading;


class fib extends Thread
{
	static int a=0,b=1,c;
	static int sum1=0;
	public static synchronized void isfiboo(int n)
	{
		int sum=0;
		for(int i=0;i<n/2;i++)
		{
			c=a+b;
			System.out.println(a);
			sum+=a;
			sum1+=sum;
			a=b;
			b=c;
		}
		System.out.println(sum+"---");
		System.out.println(Thread.currentThread().getName());
		
	}
}
public class fibonacii extends Thread {
	
	static int n;
	fibonacii(int n)
	{
		this.n=n;
	}
	public void run()
	{
		fib.isfiboo(n);
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		n=8;
		fibonacii f=new fibonacii(n);
		f.start();
		fibonacii f1=new fibonacii(n);
		f1.start();
		Thread.sleep(1000);
		System.out.println(fib.sum1);
		
		
	}

}
