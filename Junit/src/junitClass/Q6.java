package junitClass;

public class Q6 
{
	public static int vowel(String str)
	{
		str=str.toLowerCase();
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
	}
}
