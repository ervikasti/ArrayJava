
//WAPT to store ten prime number from 0-10 which are near to multiple of 10,taking 0-10,11-20,21-30,31-40,41-50....91-100 numbers at ones
class A914 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int b[] = new int[10];
		int c=0;
		for (int i=10;i<=100 ;i=i+10 )
		{
		 
		 int count = 0;
		 for (int j=i;j>(i-10);j-- )
		 {
			 // Prime Number Program
			 int k=2;
			 while(k<j)
			 {
				 if (j%k++ == 0)
				 {
					 break;
				 }
				 
			 }
			 if (j==k)
			 {
				a[count++] = j; 
			 }
			 
		 }
		//Taking diff = i-a[0] bcz we are count i from back
		 int diff = i-a[0];
		 for (int l=0; l<count; l++ )
		 {
			 //checking the difference diff is having smaller diff value 
			 if ( i-a[l] <= diff)
			 {
				b[c++]=a[l];
			 }
		 }
		
		}

        //Printing the close value multiple to 10
		for (int i=0;i<b.length ;i++ )
		{
			System.out.print(b[i]+" ");
		} 
		
	}
}
