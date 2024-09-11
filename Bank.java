package Multithreading;

import java.util.Scanner;

class BankThread
{
	static int bal;
	public synchronized void deposit(int a)
	{
		System.out.println("** "+Thread.currentThread().getName()+" **");
		System.out.println("Deposit completed..");
		bal = bal+a;
		System.out.println("Current balance : "+bal);
	}
	public synchronized void withdraw(int a)
	{
		System.out.println("\n*** "+Thread.currentThread().getName()+" ***");
		if(bal >= a)
		{
			System.out.println("Withdraw succcessfull.");
			bal-=a;
			System.out.println("Current balance : "+bal);
		}
		else
		{
			System.out.println("Insuffienct balance.\nCurrent Balance : "+bal);
		}
	}
}
public class Bank extends Thread
{
	Scanner sc;
	static Bank b;
	static int dep;
	static int wit;
	public void getDeposit()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter amount to deposit : ");
		int d = sc.nextInt();
		this.dep = d;
	}
	public void getWithdraw()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter amount to withdraw : ");
		int w = sc.nextInt();
		this.wit = w;
	}
	public void run()
	{
		BankThread bt = new BankThread();
		sc = new Scanner(System.in);
		System.out.println("\nPress 1 to deposit and 2 to withdraw : ");
		int ch = sc.nextInt();
		b = new Bank();
		switch(ch)
		{
			case 1 : b.getDeposit();
					bt.deposit(this.dep);
					break;
					
			case 2: b.getWithdraw();
				bt.withdraw(this.wit);
					break;
			
			default : System.out.println("Wrong input");
		}
	}
	public static void main(String[] args) 
	{
		Bank t1 = new Bank();
		Bank t2 = new Bank();
		Bank t3 = new Bank();
		
		try
		{
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("\nMain completed");
	}

}