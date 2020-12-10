class A913 
{
	public static void main(String[] args) 
	{
		System.out.println("----- Program will print first  25 palindrome, Starting from 23 ----");

		//CHecking for Palindrome
		int count=25;
		for (int i=23;count>0;i++ )
		{
			int num = i;
			int rev = 0;

			while (num>0)
			{
				int digit = num%10;
				rev = rev*10+digit;
				num = num/10;
			}

			if (i==rev)
			{
				count--;
				System.out.println(rev);
			}

		}

	}
}
