import java.util.Scanner;
class A96 
{
	public static void main(String[] args) 
	{
		int a[] = {2,3,7,8,10,9};
		int b[] = new int[a.length];
		int count = 0;
		System.out.println("------ REVERSE OF ARRAY and Check it is PALINDROME or not ------"+a.length);
		
		int j = a.length-1;

		for (int i=0;i<a.length ;i++ )
		{
			if (i<=j)
			{
				int temp =a[i];
				a[i] = a[j];
				a[j] = temp;

				if (a[i]==a[j])
				{
					b[i]=a[i];
					b[j]=a[i];
				}

				j--;
			}
		}
		for (int k=0;k<a.length ;k++ )
		{
			System.out.print(a[k] + " ");
		}

		for (int l=0;l<a.length ;l++ )
		{	
			if (a[l]==b[l])
			{
				count++;
			}

		}
		if(count==a.length)
		{
			System.out.println("IT is Palindrome");
		}
		else
		{
			System.out.println("IT is NOT Palindrome");
		}
	}
}
