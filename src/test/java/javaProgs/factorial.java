package javaProgs;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4!=4*3*2*1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number");
		int n =sc.nextInt();
	sc.close();
		int ans=1;
		for(int r=1;r<=n;r++)
		{
		ans = ans*r;	
		}
		System.out.println(ans);

	}

}
