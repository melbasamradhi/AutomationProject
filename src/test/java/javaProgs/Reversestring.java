package javaProgs;

import java.util.Scanner;


public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String c =sc.next();
		System.out.println("input string  is "+c);
		sc.close();
		String ans="";
	int a =	c.length();
	System.out.println("input string length is "+ a);
for(int b=a-1;b>=0;b--)
{
ans =ans+ c.charAt(b);

}
System.out.println("reverse string  is "+ ans);
//int h = c.compareTo(ans);
	if(c.equalsIgnoreCase(ans))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}

}
}
