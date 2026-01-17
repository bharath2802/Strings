//Print only Digits  of a string
import java.util.Scanner;
class PrintDigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			System.out.print(c);
		}
	}
}