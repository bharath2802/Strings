//Delete word Red in a sentence
class DelWord
{
	public static void main(String args[])
	{
		String s="Red lorry Yellow lorry";
		s+=" ";
		String w="";
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			w+=c;
			else{
				if(!w.equals("Red"))
				ns=ns+w+" ";
				w="";
				}
			}
		System.out.print(s+" After delete Red word:" +ns);
	}
}