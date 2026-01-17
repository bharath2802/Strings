//each character of a string in separate line
import java.util.Scanner;
class SepLine
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			System.out.println(c);
		}
	}
}