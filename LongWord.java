//Longest word in a sentence
class LongWord
{
	public static void main(String args[])
	{
		String s="HELLO Bharath How are you";
		s+="";
		String w="";
		String lw="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			w+=c;
			else{
			if(w.length()>lw.length())
				lw=w;
				w="";
			}
		}
			System.out.print("the longest word is:"+lw.length()+ " "+lw);
	}
}
		
				