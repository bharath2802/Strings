//count number of words in a sentence
class NumOfWords
{
	public static void main(String args[])
	{
		String s="Hello bharath welcome to java";
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
		System.out.println(w+" "+count);
		w="";
			}
		}
		//System.out.print(count);
	}
}