//print each word of a sentence in a separate line
class EachWord
{
	public static void main(String args[])
	{
	String s="Hello i am Bharath";
	String w="";
	s+=" ";
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