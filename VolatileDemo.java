package Multithreading;

public class VolatileDemo {

	static volatile int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=new Thread(()->
		{
			int localcount=count;
			while(localcount<10)
			{
			while(localcount!=count)
			{
				System.out.println("Counter is changed:Thread1");
				localcount=count;
				count=localcount;
			}
			}
			
		});
	
		Thread t2=new Thread(()->
		{
			int localcount=count;
			while(localcount<10)
			{
				System.out.println("Thread2:"+(localcount++));
				count=localcount;
			}
			
		});
		System.out.println(count);
		t.start();
		t2.start();
		
		

	}

}
