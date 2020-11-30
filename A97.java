
class A97 
{
	public static void main(String[] args) 
	{
		int a[] = {2,3,7,8,3,10,9};
		System.out.println("----- Program will print apperance of given value 3 in array -----");
		int val = 3;
		int count = 0;

		for (int i=0;i<a.length ;i++ )
		{
			if (a[i] == val)
			{
				count++;
			}
		}
				System.out.println("Number of apperance of 3 in array is :"+count);
	}
}
