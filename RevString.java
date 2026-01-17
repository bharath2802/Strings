//reverse of a string
class RevString
{
	public static void main(String args[])
	{
		String s="Bharath";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			rev=c+rev;
		}
		System.out.print(rev);
	}
}