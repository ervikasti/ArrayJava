// This program will convert a number into word
import java.util.Scanner;
class NumStr 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		while(num>0)
		{
			int digit = num%10;

			if (digit == 0)
			{
				System.out.print("Zero ");
			}
			else if (digit == 1)
			{
				System.out.print("One ");
			}
			else if (digit == 2)
			{
				System.out.print("Two ");
			}
			else if (digit == 3)
			{
				System.out.print("Three ");
			}
			else if (digit == 4)
			{
				System.out.print("Four ");
			}
			else if (digit == 5)
			{
				System.out.print("Five ");
			}
			else if (digit == 6)
			{
				System.out.print("Six ");
			}
			else if (digit == 7)
			{
				System.out.print("Seven ");
			}
			else if (digit == 8)
			{
				System.out.print("Eight ");
			}
			else 
			{
				System.out.print("Nine ");
			}
			num =num/10;
		}
	}
}
