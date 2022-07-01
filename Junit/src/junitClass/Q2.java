package junitClass;

public class Q2 
{
	public static boolean pal(String s1,String s2) 
	{	
		int i=0;
		char s[]=s1.toCharArray();
		int j=s.length-1;
		while(i<j)
		{
			char temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
		String str = new String(s);
		if(str.equals(s2))
		{
			return true;
		}else
		{
			return false;
		}
	}
}
