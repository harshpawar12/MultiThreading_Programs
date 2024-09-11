package Multithreading;

public class floyadTringle {
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;int  c=0;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				c++;
				System.out.print(c+" ");
			}
			System.out.println();
		}
		

	}

}
