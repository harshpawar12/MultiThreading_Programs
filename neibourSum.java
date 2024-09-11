package Multithreading;

import java.util.Arrays;

public class neibourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		String str=String.valueOf(num);
		char ch[]=str.toCharArray();
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			int sum=0;
			if(i>0)
			{
			sum+=ch[i-1]-'0';
		
			}
			if(i<ch.length-1)
			{
				System.out.println(i+" "+ch.length);
				sum+=ch[i+1]-'0';
			}
			System.out.print(sum);
		}

	}

}
