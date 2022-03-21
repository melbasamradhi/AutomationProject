package javaProgs;

public class Strngdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Malayalam";
		StringBuffer b =new StringBuffer(s);
		System.out.println(s);
		
		System.out.println(b);
	StringBuffer c =	b.reverse();
	String d =c.toString();
	Boolean r =s.equalsIgnoreCase(d);
	if( r == true)
	{
		System.out.println("yes");
		
	}
	else
	{
		System.out.println("no");
	}
	
int a=3453;
int g =String.valueOf(a).length();
System.out.println(g);
Integer v=98345;
System.out.println(v.toString());
int j =v.toString().length();
System.out.println(j);

		
			
		
	

}
}
