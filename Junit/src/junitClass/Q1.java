package junitClass;


public class Q1 
{
	public static int hcf(int num1,int num2) 
	{
		int hcf=0;

	    for (int i = 1; i <= num1 || i <= num2; i++)
	      {
	     if (num1 % i == 0 && num2 % i == 0)
	        hcf = i;
	      }

	    return hcf;

	}
	
}
