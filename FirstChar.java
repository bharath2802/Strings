//print first character of a each word
class FirstChar
{
	public static void main(String args[])
	{
		String s="I am bharath";
		String w="";
		s+=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
				w+=c;
			else{
			System.out.print(w.charAt(0));
			w="";
			}
		}
	}
}