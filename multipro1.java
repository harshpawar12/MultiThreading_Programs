package Multithreading;

public class multipro1 extends Thread{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello World");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multipro1 h=new multipro1();
		h.start();
		

	}

}
