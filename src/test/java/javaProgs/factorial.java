package javaProgs;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4!=4*3*2*1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input number");
		int n=sc.nextInt();
		int input=n;
		sc.close();
		int ans=n;
		n=n-1;
		for(int i=1;i<=input-1;i++)
		{
			ans=ans*n;
			n=n-1;
		}
		System.out.println("The factorial value of "+input+" is "+ans);
		

	}

}
