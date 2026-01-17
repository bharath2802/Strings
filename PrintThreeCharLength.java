//Print only word having 3 character in a sentence
class PrintThreeCharLength
{
	public static void main(String args[])
	{
		String s="Amd arg mod print type";
		s+=" ";
		String w="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
				w+=c;
			else{
				if(w.length()==3)
				System.out.println("the word length 3 in a sentence is:"+w);
				w="";
				}
		}
	}
}