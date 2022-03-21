package javaProgs;

public class Arraylargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a[]= new int[5];
int a[]= {23,45,76,1,29,100,7,234};
int n =a.length;
for(int ar:a)
{
	System.out.print(ar);
	System.out.print(" ");
}
int l=a[0];
for(int b=1;b<n;b++)
{
	if (l<a[b])
			{
		l=a[b];
			}
}
System.out.println("  ");
System.out.println(l);
	}
	
}
