//change the word RED with BLUE in a sentence and print it
class ChangeWord
{
	public static void main(String args[])
	{
		String s="A Red Seed";
		s+=" ";
		String w="";
		String ns="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			w+=c;
			else{
				if(w.equals("Red"))
				ns=ns+"blue"+" ";
				else
				ns=ns+w+" ";
			w="";
				}
		}
	System.out.print(s+" change into "+ns);
	}
}