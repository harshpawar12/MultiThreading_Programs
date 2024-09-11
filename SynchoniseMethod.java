package Multithreading;

class array
{
	public static synchronized void isarry(int start,int a[],int end)
	{
		int sum=0;
		for(int i=start;i<end;i++)
		{
			sum+=a[i];
			System.out.print(a[i]+" ");
		}
		
		SynchoniseMethod.sum+=sum;
		System.out.println(Thread.currentThread().getName());
		System.out.println();
		System.out.println("sum is:");
		System.out.println(sum);
	}
	
}
public class SynchoniseMethod extends Thread{
	
     int a[];
	 int start,end;
	 static int sum=0;
	SynchoniseMethod(int start,int end,int a[])
	{
		this.a=a;
		
	    this.end=end;		
	    this.start=start;
	
	
	}
	public void run()
	{
		array.isarry(start,a,end);
	}
	

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		//SynchoniseMethod a=new SynchoniseMethod();
		int a[]= {1,2,3,4,5,6};
		int mid=a.length/2;
		SynchoniseMethod t=new SynchoniseMethod(0,mid,a);
		SynchoniseMethod t1=new SynchoniseMethod(mid,a.length,a);
		
		
		t.start();
		t.join();
		t1.start();
		
		t1.join();
		System.out.println("Total sum Is:");
		System.out.println(SynchoniseMethod.sum);
		

	}

}
