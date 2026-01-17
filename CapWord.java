//write a program to captalize each word of a sentance
class CapWord
{
	public static void main(String args[])
	{
		String s="hello bharath how are you";
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
			f=Character.toUpperCase(f);
			ns=ns+f+w.substring(1)+" ";
			w="";
			}
		}
	System.out.print(ns);
	}
}