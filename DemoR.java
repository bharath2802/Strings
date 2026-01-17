//print only word starting with "R"
class DemoR
{
	public static void main(String args[])
	{
		String s="Rahul Rohan Bharath";
		s+=" ";
		String w="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			w+=c;
			else{
				if(w.startsWith("R"))
				System.out.println(w);
				w="";
				}
		}
	}
}