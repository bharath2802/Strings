//count the words ending with "D"
class CountD
{
	public static void main(String args[])
	{
		String s="Bad Mad GOOd hello";
		s+=" ";
		String w="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
				w+=c;
			else{
			if(w.endsWith("d"))
				count++;
				w="";
				}
		}
			System.out.print(count);
	}
}