package junitClass;

public class Q4 
{
	public static boolean Arm(int num)
	{
		 int  number, temp, total = 0;

	        number = num;
	        while (number != 0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }
	        if(total == num)
	            return true;
	        else
	            return false;
	}
}
