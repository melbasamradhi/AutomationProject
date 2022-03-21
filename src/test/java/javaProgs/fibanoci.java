package javaProgs;

import java.util.Scanner;

public class fibanoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,1,2,3,5,8,13,21
		int a,b,sum,n;
		a=0;
		b=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number");
		 n =sc.nextInt();
		 sc.close();
		 System.out.print("fibbanoci series for "+n+" number is 0 1 ");
		for(int i=3;i<=n;i++)
		{
		sum= a+b;
		a=b;
		b=sum;
		System.out.print(sum+" ");
		}
		
		

	}

}
