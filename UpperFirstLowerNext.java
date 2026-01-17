//create a string uppercase first and lowercase next
class UpperFirstLowerNext
{
	public static void main(String args[])
	{
		String s="I am Bharath Raju";
		String u="",l="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				u=u+c;
			else
				l=l+c;
		}
			String sen=u+l;
			System.out.print(sen);
	}
}