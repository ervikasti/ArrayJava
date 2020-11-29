class A94 
{
	public static void main(String[] args) 
	{
		int a[] = {2,3,7,10,8,9};
		
		System.out.println("---- PROGRAM will PRINT COUNT OF PRIME NO.  from an ARRAY ");
		int count=0;
		
		for (int i=0;i<a.length ;i++ )
		{	
			int k=2;


			for (int j=k;k<a[i] ;k++ )
			{
			
				if (a[i]%k == 0)
				{
					break;
				}

			}
			
			if (a[i]==k)
			{
				count++;
						
			}


		}
		System.out.println("COUNT IS  "+ count);
	}
}
