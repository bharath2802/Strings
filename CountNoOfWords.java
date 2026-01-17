//count the number of words in a sentence
class CountNoOfWords
{
	public static void main(String args[])
	{
		String s="Hello Bharath welcome to java programming";
		s+=" ";
		String w="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			w+=c;
			else{
				count++;
				w="";
				}
		}
		System.out.print("the number of words in a sentence :"+count);
	}
}