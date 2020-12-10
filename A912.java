
import java.util.Scanner;
class A912 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
        System.out.println("--- Pgram will print first 10 PRIME num from given range in a REVERSE the DIGIT Order -----");
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
		// Reverse the digits of Array A
		int z= a.length-1;
		for (int i = 0;i<a.length ;i++ )
		{
			int num =a[i];
			a[i] = 0;
			while(num>0)
			{
				int digit = num%10;
				a[i] = a[i]*10+digit;
				num = num/10;
			}
			
		}
		//Printing the reverse digit array

		for (int i=0;i<a.length ;i++ )
		{
			System.out.print(a[i]+" ");
		}

	}
}
