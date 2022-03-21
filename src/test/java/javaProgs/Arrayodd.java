package javaProgs;

public class Arrayodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,45,76,1,29,100,7,234};
		int b[] = new int [8];
		int c[]= new int[8];
		int n =a.length;
		for(int ar:a)
		{
			System.out.print(ar);
			System.out.print(" ");
		}
		System.out.println(" ");
		int j=0;int k=0;
		for(int i=0;i<n;i++)
		{
			int flag =0;
			if (a[i]%2==0)
			{
				System.out.println(a[i]+" is even ");
				
			}
			else
			{
				System.out.println(a[i]+" is odd ");
				flag =1;
				
			}
			
			if(flag==0)	
			{
				
				b[j]=a[i];
				j++;
			}
			else
			{
				c[k]=a[i];
			k++;
			}
				
				
		}
		
		for(int ar1:b)
		{
			System.out.print(ar1);
			System.out.print(" ");
		}
		System.out.println(" ");
		for(int ar2:c)
		{
			System.out.print(ar2);
			System.out.print(" ");
		}
		
		
	}

}
