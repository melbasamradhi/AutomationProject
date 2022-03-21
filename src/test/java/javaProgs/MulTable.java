package javaProgs;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the multiplication table number");
int a=sc.nextInt();

for(int b=1;b<=10;b++)
{
	int c =a*b;
	System.out.println( a+ "*"+ b+ "="+ c);
}


System.out.println("enter the input number");
int t=sc.nextInt();
sc.close();
int ans=0;
int n= String.valueOf(t).length();
for(int k=1;k<=n;k++)
{
	ans= ans+(t%10);
	t=t/10;
}
System.out.println("sum of digits = "+ans);

	}

}
