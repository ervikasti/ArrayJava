class A93 
{
	public static void main(String[] args) 
	{
		int a[] = {2,3,7,10,8,9};
		int sumEven=0,sumOdd=0;
		System.out.println("---- PROGRAM will PRINT DIFFERENCE BTW SUM OF  Odd & EVEN no.  from an ARRAY ");
		for (int i=0;i<a.length ;i++ )
		{	
			if (a[i]%2 !=0)
			{
				sumEven = sumEven+a[i];
			}
			else 
			{
				sumOdd =  sumOdd +a[i];
			}
		}
		System.out.println("DIFFERENCE OF SUM OF ODD AND EVEN is "+ (sumOdd-sumEven));
	}
}
