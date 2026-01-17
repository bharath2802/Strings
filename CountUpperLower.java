//Count uppercase and lowercase character in a string
class CountUpperLower
{
	public static void main(String args[])
	{
		String s="Hello Java Programming";
		int count=0,countl=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				count++;
			if(Character.isLowerCase(c))
				countl++;
			
		}
			System.out.println(count+" UPPER");
			System.out.println(countl+"LOWER");
	}
}