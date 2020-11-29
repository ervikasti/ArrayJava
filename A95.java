class A95 
{
	public static void main(String[] args) 
	{
		int a[] = {2,3,7,10,8,9};
		
		System.out.println("---- PROGRAM will PRINT factorial of each no. from an ARRAY ----- ");


		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]<10)
			{
				int fact = 1;
				int digit = a[i];
				while(digit>0)
				{
					fact = fact*digit;
					digit--;
				}
				a[i]=fact;
			}

		}

		for (int j=0;j<a.length ;j++ )
		{
			System.out.print(a[j]+" " );
		}
	}
}
