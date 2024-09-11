package Multithreading;

public class Multithredingmethods extends Thread {
	
	public void run()
	{
		System.out.println("Running ...."+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithredingmethods h=new Multithredingmethods();
		Multithredingmethods h1=new Multithredingmethods();
		Multithredingmethods h2=new Multithredingmethods();
System.out.println("Thread Priority...");
			h.setPriority(MAX_PRIORITY);
			h1.setPriority(NORM_PRIORITY);
			h2.setPriority(3);
			System.out.println("First Thread are:"+h.getPriority());
			System.out.println("Second Thread is:"+h1.getPriority());
			System.out.println("Third Thread is:"+h2.getPriority());
System.out.println("-------------------------");
		System.out.println("First Thread are:"+h.getName());
		System.out.println("Second Thread is:"+h1.getName());
		System.out.println("Second Thread is:"+h2.getName());

		System.out.println("--------------------");

		
		System.out.println(currentThread().currentThread().getName());// it can acess the Static way.
		
		h.start();
		h1.start();
		h2.start();
		System.out.println("--------------------");
		h1.setName("T1");
		h.setName("T");
		h2.setName("t3");
		System.out.println("First Thread are:"+h.getName());
		System.out.println("Second Thread is:"+h1.getName());
		System.out.println("Second Thread is:"+h2.getName());

		
	}

}
