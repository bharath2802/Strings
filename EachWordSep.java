//print each word of a sentence in a separate line
class EachWordSep
{
	public static void main(String args[])
	{
		String s="Hello I Am Bharath";
		s+=" ";
		String w="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			w+=c;
			else{
				System.out.println(w);
				w="";
				}
		}
	}
}