package javaProgs;

import java.util.Scanner;

public class Testnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 2345;
	int b =	String.valueOf(a).length();
System.out.println(b);*/
Scanner sc = new Scanner(System.in);
System.out.println("Enter input number");
int c =sc.nextInt();
String s =String.valueOf(c);
//System.out.println(s);
int d =s.length();
System.out.println("The length of the given number is"+" "+d);
sc.close();
StringBuffer b = new StringBuffer(s);
String ans = b.reverse().toString();
if(ans.equals(s))
{
	System.out.println("palindrome");
}
else
{
	System.out.println(" not palindrome");
}
	}

}

