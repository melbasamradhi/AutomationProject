package javaProgs;

import java.util.Scanner;

public class StrSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
/*String c=	sc.nextLine();
String a[]=c.split("[]+");
System.out.println(a);*/

String line = sc.nextLine();
String[] words = line.split("[ ]");
for(String w:words)
{
System.out.println(w);
}
System.out.println("Penultimate word: "+words[words.length - 2]);

	}

}
