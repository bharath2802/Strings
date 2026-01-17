//write a program to swap first and last letter of each word
class SwapFirstLast
{
	public static void main(String args[])
	{
		String s="hello bharath";
		s+=" ";
		String w="";
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			w+=c;
			else{
			char f=w.charAt(0);
			char l=w.charAt(w.length()-1);
			String m=w.substring(1,w.length()-1);
			ns=ns+l+m+f+" ";
			w="";
				}
		}
	System.out.print(s+" After Swap :"+ns);
	}
}