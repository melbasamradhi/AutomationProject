package javaProgs;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
String c=	sc.nextLine();
	//	String c =sc.next();
		System.out.println("input string  is " +c);
		sc.close();
		int ans=0;
char a[]=		c.toCharArray();
System.out.println(a);
int n=a.length;
int s=n;
char b[]=new char[n];

for(int r=0;r<=n-1;r++)
{
	b[r]=a[s-1];
	s--;
}
System.out.println(b);

for(int d=0;d<=n-1;d++)
{
	if(Character.isDigit(a[d]))
	{
		ans++;
	}
		
}
System.out.println(ans);
	}

}
