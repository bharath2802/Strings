//print only word ending with "ED"
class EndsWithED
{
	public static void main(String args[])
	{
		String s="RED SEED NEED BAD";
		s+=" ";
		String w="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
				w+=c;
			else{
				if(w.endsWith("ED"))
					System.out.println(w);
					w="";
			}
		}
	}
}