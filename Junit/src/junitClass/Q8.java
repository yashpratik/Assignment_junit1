package junitClass;

public class Q8
{
	public static boolean checkeven() 
	{
	int a[] = {2,3,4,5,6,7};
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			return true;
		}
	}
	return false;
}
}