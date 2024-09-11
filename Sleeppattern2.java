package Multithreading;
/*
 * 	 *
    *  *
   *    *
  *      *
 *********
 */
public class Sleeppattern2 extends Thread{
	 public void run()
	 {
		 int n=5;
		 for(int i=1;i<=n;i++)
		 {
			 for(int k=n;k>=i;k--)
			 {
				 
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 if(j==1||j==i||i==n)
				 {
				 System.out.print("* ");
				 }
				 else
				 {
					 System.out.print("  ");
				 }
				 try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			 }
			 System.out.println();
		 }
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sleeppattern2 h=new Sleeppattern2();
		h.start();

	}

}
