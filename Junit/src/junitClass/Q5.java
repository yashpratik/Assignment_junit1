package junitClass;

public class Q5 
{
	public static boolean py(int a,int b, int c)
	{
		 if (a * a + b * b == c * c ||
		            a * a + c * c == b * b ||
		            b * b + c * c == a * a)
		 {
			 return true;
		 }else
		 {
			 return false;
		 }
	}
}
