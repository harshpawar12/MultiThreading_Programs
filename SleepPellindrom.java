package Multithreading;

import java.util.Scanner;

/*
 * WAP to create two thread check palindrome 
 * with one and with another check prime  number.
 */
class prime extends Thread
{
	public void run()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enetr the prime number:");
			int n1=sc.nextInt();
			int c=1;
			for(int k=1;k<n1;k++)
			{
				if(n1%k==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println("prime Number..");
			}
			else
			{
				System.out.println("not prime number..");
			}
	}
}
public class SleepPellindrom extends Thread{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the pellindrom number:");
		int n=sc.nextInt();
		int rem=0,rev=0;
		int i=n;
		while(i!=0)
		{
			rem=i%10;
			rev=(rev*10)+rem;
			i=i/10;
		}
		if(rev==n)
		{
			System.out.println("pellindrom number");
		}
		else {
			System.out.println("not pellindrom");
		}
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepPellindrom d=new SleepPellindrom();
		prime p=new prime();
		d.start();
		p.start();

	}

}
