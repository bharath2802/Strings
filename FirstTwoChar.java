//first 2 characters of each word
class FirstTwoChar
{
	public static void main(String args[])
	{
		String s="Hello am bharath";
		s+=" ";
		String w="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			w+=c;
			else{
				System.out.print(w.substring(0,2));
				w="";
				}
		}
	}
}