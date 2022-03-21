package javaProgs;

import java.util.Random;

public class Randomno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a = Math.random();
int b =(int) a;
System.out.println(a);
System.out.println(b);
Random r = new Random();
int r1= r.nextInt(600);
System.out.println(r1);
int r2 = r.nextInt();
System.out.println(r2);
Boolean g = r.nextBoolean();
System.out.println(g);
	}

}
