package Multithreading;
class fact extends Thread
{
	public void run()
	{
		int fact=1;
		for(int i=1;i<=3;i++)
		{
			fact=fact*i;
			System.out.println(i+"---->: "+fact);

		}
	}
	
}
public class Factorialfind extends Thread{
	
	public void run()
	{
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
			System.out.println(i+" Fact: "+fact);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorialfind h=new Factorialfind();
		h.start();
		fact f=new fact();
		f.start();
		
	}

}
