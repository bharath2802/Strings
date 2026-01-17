//print all special words starting and with same character eg:mom,dad,amma,nanna
class SpecialWords
{
	public static void main(String args[])
	{
		String s="mom dad amma nanna hello";
		s+=" ";
		String w="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
				w+=c;
			else{
				char f=w.charAt(0);
				char l=w.charAt(w.length()-1);
				if(f==l)
					System.out.println(w);
					w="";
				}
		}
	}
}