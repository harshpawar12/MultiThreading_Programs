package Multithreading;

import java.util.Scanner;

/*
 * 6. Write a program that creates a thread that
 *  calculates the factorial of a number.
 *   The main thread should wait for the thread to
 *    finish and then print out the result.
 */
public class sleepExfact extends Thread {
	
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the 1st number:");
		int n=sc.nextInt();
		System.out.println("Enetr the 2nd number:");
		int n1=sc.nextInt();
		System.out.println("Factorial of number:");
		for(int i=n;i<=n1;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			System.out.println(fact);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sleepExfact f=new sleepExfact();
		f.start();
		System.out.println("main completed...");
		

	}

}
