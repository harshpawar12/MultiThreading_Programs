package Multithreading;
/*
 * Write a program that creates two threads,
 *  one of which counts up 
 to 100 and the other counts down from 100.
  Print out the values each thread counts to.
 */
class reverse extends Thread{
	
	public void run()
	{
		for(int i=100;i>=1;i--)
		{
			System.out.print(i+"\n ");
		}
	}
}
public class printnumber extends Thread {
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printnumber p=new printnumber();
		p.start();
		reverse r=new reverse();
		r.start();

	}

}
