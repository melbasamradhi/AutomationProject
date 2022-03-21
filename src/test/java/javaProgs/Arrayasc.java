package javaProgs;

public class Arrayasc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,45,76,1,29,100,7,234};
		int n =a.length;
		for(int ar:a)
		{
			System.out.print(ar);
			System.out.print(" ");
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if (a[i]<a[j])
				{
					int t;
					t=a[i];
					a[i]=a[j];
					a[j]=t;
	
			
				}
			}
		}
		
		System.out.println(" ");
		
		for(int ar1:a)
		{
			System.out.print(ar1);
			System.out.print(" ");
		}
			

	}

}
