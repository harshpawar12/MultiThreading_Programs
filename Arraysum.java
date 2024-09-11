package Multithreading;


class issum extends Thread
{
	static int sum1=0;
	static int cnt=0;
	public static synchronized void array(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length/2;i++)
		{
			sum+=a[cnt++];
		}

		System.out.println(Thread.currentThread().getName());
		System.out.println(sum);
		sum1+=sum;
	}
}
public class Arraysum extends Thread{
	

	int a[];
	Arraysum(int a[])
	{

		this.a=a;
	}
	public void run()
	{
		issum.array( a);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		Arraysum t1=new Arraysum(a);
		Arraysum t2=new Arraysum(a);

		t1.start();
		t2.start();
		Thread.sleep(1000);
		System.out.println(issum.sum1);
		
		
	}

}
