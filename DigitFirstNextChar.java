//print digit first next character in a string
class DigitFirstNextChar
{
	public static void main(String args[])
	{
		String s="No26 Sound";
		String d="",r="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
				d=d+c;
			else
				r=r+c;
		}
		String sen=d+r;
		System.out.print(sen);
	}
}