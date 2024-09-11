package Multithreading;

public class GarbageCollector {
	
	public void finalize()
	{
		System.out.println("Garbage colllector colllected...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector g1=new GarbageCollector();
		GarbageCollector g2=new GarbageCollector();

		System.out.println("Garbage domo....");
		g1=g2;
		
		new GarbageCollector();
		
		System.gc();

	}

}
