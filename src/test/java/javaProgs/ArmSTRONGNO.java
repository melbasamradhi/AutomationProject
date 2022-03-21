package javaProgs;

import java.util.Scanner;

public class ArmSTRONGNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//153= 1^3+5^3+3^3,  1634   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number");
		int n =sc.nextInt();
		//int n= 1635;
		int m = String.valueOf(n).length();
		sc.close();
		System.out.println(m);
		int ans=0,temp,p,u;
		temp = n;
		
		for(int r=1;r<=m;r++)
		{
			u=1;p=1;
			
			int c = n%10;
			for(u=1;u<=m;u++)
			{
			p=p*c;
			
			
		
			}
			n=n/10;
			ans = ans+p;
		}
		System.out.println(ans);
		if(temp==ans)
		{
			System.out.println("armstrong no");
		}
		else
		{
			System.out.println(" not armstrong no");
		}
		

	}

}
