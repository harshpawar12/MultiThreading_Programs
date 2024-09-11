package Multithreading;

class EO extends Thread
{
	public static synchronized void isSum(String s,int ch)
	{

		for(int i=0;i<s.length();i++)
		{
			
			if((ch==1 && s.charAt(i)%2==0) || (ch==2 && s.charAt(i)%2!=0))
			{
				
				System.out.println(s.charAt(i));
			}	
			
			
		}
		
		
		System.out.println(Thread.currentThread().getName());
	
		
	
	}
	
}
public class sumEvenOdd extends Thread {
	
	static String s;
	int ch=0;
	sumEvenOdd(String s,int ch)
	{
		this.s=s;
		this.ch=ch;
	}
	public void run()
	{
		EO.isSum(s,ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 s="12345678";
		
		sumEvenOdd t=new sumEvenOdd(s,1);
		t.start();
		sumEvenOdd t1=new sumEvenOdd(s,2);
		t1.start();
		
		

	}

}
