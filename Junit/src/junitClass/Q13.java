package junitClass;

public class Q13
{
	public static int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public static int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public static int mul(int a, int b)
	{
		int c=a*b;
		return c;
	}
	public static boolean div(int a, int b)
	{
		try
		{
			int c=a/b;
			return true;
		}catch(ArithmeticException e)
		{
			return false;
		}
	}
	
	public static boolean mod(int a, int b)
	{
		try
		{
			int c=a%b;
			return true;
		}catch(ArithmeticException e)
		{
			return false;
		}
	}
	
	public static double  pow(double a) throws Exception
	{
		double qbrt = 1;
		if(a<0)
		{
			throw new Exception("number can not be les than 0");
		}else
		{
			qbrt = Math.cbrt(a);
		}
		return qbrt;
	}
	
	public static double sqr(double a) throws Exception
	{
		double sqrt = 1;
		if(a<0)
		{
			throw new Exception("Number can not less then 0");
		}else
		{
			sqrt = Math.sqrt(a);
		}
		return sqrt;
	}
	
}
