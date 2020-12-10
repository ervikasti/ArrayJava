
import java.util.Scanner;
class A911 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
        System.out.println("--- Pgram will print first 10 PRIME num from given range in a REVERSE Order -----");
		System.out.println("Enter the Start point");
		int start = s1.nextInt();
		System.out.println("Enter the End point");
		int end = s1.nextInt();
		System.out.println();
		
		int x=0;
		int a[] = new int[10];

		for (int i=start;start<=end ;start++ )
		{
			
			int k=2;
			for (int j=k;k<=start ;k++ )
			{
				if (start%k==0 )
					{
						break;
					}

			}
			if (start==k)
			{
				if (x<=9)
				{
				 a[x++]=start;
				}

			}
			
		}
		// Reverse an Array A
		int z= a.length-1;
		for (int i = 0;i<a.length ;i++ )
		{
			if (i<=z)
			{
				int temp = a[i];
				a[i] = a[z];
				a[z] = temp;
				z--;
			}
		}
		//Printing the reverse array

		for (int i=0;i<a.length ;i++ )
		{
			System.out.print(a[i]+" ");
		}

	}
}
