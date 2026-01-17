//Count uppercase character in a string
class CountUpper
{
	public static void main(String args[])
	{
		String s="Hello Java Programming";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				count++;
			
		}
			System.out.print(count+" UPPER");
	}
}