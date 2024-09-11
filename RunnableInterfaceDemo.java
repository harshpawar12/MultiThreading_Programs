package Multithreading;

class person implements Runnable
{
	public void run()
	{
		System.out.println("Runnable are running....");
	}
}
class employee extends Thread
{
	public void run()
	{
	System.out.println("Thred are Running...");	
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("satr");
		
	}
}
public class RunnableInterfaceDemo {
	
	public static void main(String[] args) 
	{
		person p=new person();
		p.run();
		employee e=new employee();
		e.start();
		e.run();
		
		
		
	}

}
