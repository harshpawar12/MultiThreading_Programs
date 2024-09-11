package Multithreading;
class bookingEx
{
	int total_seats=10;
	public synchronized void seatbook(int seat)
	{
		if(total_seats < seat)
		{
			System.out.println("Seat are not available..");
			System.out.println("There are only"+total_seats);
			
		}
		else
		{
			System.out.println(seat+"seat booking confirmed..");
			total_seats=total_seats-seat;
		}
		
	}
}
class Thread1 extends Thread
{
	bookingEx obj;
	int seat;
	public Thread1(bookingEx obj,int seat)
	{
		this.obj=obj;
		this.seat=seat;
	}
	public void run()
	{
		obj.seatbook(seat);
	}
}
class Thead2 extends Thread
{
	bookingEx obj;
	int seat;
	public Thead2(bookingEx obj,int seat)
	{
		this.obj=obj;
		this.seat=seat;
	}
	public void run()
	{
		obj.seatbook(seat);
	}
}
public class StaticSyncEx
{
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookingEx obj1=new bookingEx();
		Thread1 t1=new Thread1(obj1, 7);
		Thread1 t2=new Thread1(obj1, 4);
		t1.start();
		t2.start();
		
		bookingEx obj2=new bookingEx();
		Thread1 t3=new Thread1(obj2, 7);
		Thread1 t4=new Thread1(obj2, 4);
		t3.start();
		t4.start();
		

	}


}

