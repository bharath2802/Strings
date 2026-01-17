//print first two characters of each word
class FirstTwoCharOfEachWord
{
	public static void main(String args[])
	{
		String s="Hello Bharath welcome to java";
		s+=" ";
		String w="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			w+=c;
			else{
				System.out.println(w.substring(0,2));
				w="";
				}
		}
	}
}