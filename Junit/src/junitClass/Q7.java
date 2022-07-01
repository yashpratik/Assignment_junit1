package junitClass;

public class Q7 
{
	public static boolean pal(int a)
	{
		 int sum = 0, r;
		 int temp = a;    
	     while(a>0)
		   {    
	        r = a % 10;   
	        sum = (sum*10)+r;    
	        a = a/10;    
	       }    
	      if(temp==sum) 
	      {
	        return true;
	      }else
	      {
	        return false;
	      }
	}
}
