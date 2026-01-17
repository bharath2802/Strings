//print only the word contains "E" in a sentence
class WordContainsE
{
	public static void main(String args[])
	{
		String s="RED BED SEED ENJOY";
		s+=" ";
		String w="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			w+=c;
			else{
				if(w.contains("E"))
					System.out.println("The word contains E is :"+w);
					w="";
				}
		}
	}
}