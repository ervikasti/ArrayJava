import java.util.Scanner;
class RevStr 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		StringBuilder sb=new StringBuilder(s1.nextLine());    
		System.out.println(sb.reverse());
	}
}
