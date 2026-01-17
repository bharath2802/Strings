//creating a string after removing all spaces
class RemSpace
{
	public static void main(String args[])
	{
		String s="Hello i am bharath";
		String r="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!Character.isWhitespace(c))
				r=r+c;
		}
		System.out.print(r);
	}
}