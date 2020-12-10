import java.util.Scanner;
class A910 
{
	public static void main(String[] args) 
	{
		 Scanner s = new Scanner(System.in);
		System.out.println("----- Program will print ARRAY in DESCENDING Order -----");
		System.out.println("Enter the size of array");
		char a[] = new char[s.nextInt()];

		for (int i=0;i<a.length ;i++ )
		{
			System.out.println("Enter the character for index "+i);
			a[i] = s.next().charAt(0);
		}
		
		//Selection Sort method 
		// < is for sorting in decending
		for (int i=0;i<a.length-1 ;i++ )
		{
			int min = a[i];
			int min_index = i;

			for (int j=i+1;j<a.length ;j++ )
			{
				if (a[j]>min)
				{
					
					min = a[j];
					min_index = j;
				}
			}
			if (i != min_index)
			{
				char temp = a[i];
				a[i] = a[min_index];
				a[min_index]=temp;
				
			}
		}
        System.out.println("Descending sorted array is :");
		for (int i=0;i<a.length ;i++ )
		{
			System.out.print(" "+a[i]);
		}


		}
}
