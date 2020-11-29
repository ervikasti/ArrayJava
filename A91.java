class A91 
{
	public static void main(String[] args) 
	{
		int a[] = {2,3,7,10,8,9};
		int count = 0;
		System.out.println("---- PROGRAM will Give Total count of Odd no. from an ARRAY ");
		for (int i=0;i<a.length ;i++ )
		{	
			if (a[i]%2 !=0)
			{
				count++;
			}
		}
		System.out.println("Total count of Odd no. "+count);
	}
}
