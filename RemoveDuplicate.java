// import java.util.Arrays;
class RemoveDuplicate 
{
	public static void main(String[] args) 
	{
		int a[]={2,3,45,4,4,3,3,8};
		int b[] = new int[a.length];
		int k=0;
		// Arrays.sort(a);
		for (int i=0;i<a.length ;i++ )
		{
			int count=0;
			for (int j=i+1;j<a.length ;j++ )
			{
				if(a[i] == a[j])
				{
					count++;
					a[j]=0;
				}
					
				
			}
			if (count == 0)
			{
				b[k++]=a[i];
				
			}
		}

		for (int i=0 ;i<k;i++ )
		{
			if (b[i]!=0)
			{
				System.out.print(b[i]+" ");
			}
				
			
			
		}
		
	}
}
