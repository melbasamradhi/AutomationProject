package javaProgs;

import java.util.Scanner;

public class palindr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int[] g = {23,0,1,2,45,47,63,99,101};
int m =g.length;
for(int i =0;i<=m-1;i++)
{
	int n,k,flag=0;
		
	n=g[i];
	k=n/2;
	
	
	if (n==0 || n==1)
	{
		System.out.println("neither prime nor composite");
		
	}
	else if(n%2==0)
	
	{
		System.out.println("not prime");
	}
	else
	{
		for(int b=3;b<=k;b++)
		{
			if(n%b==0)
			{
				System.out.println("not prime");
				flag=1;
				break;
			}
			
		}
		if (flag==0)
		{
			System.out.println("prime");
		}
			
	}			
		}
		
	}
}
	

	


