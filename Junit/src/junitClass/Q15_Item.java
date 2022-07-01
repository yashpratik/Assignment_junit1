package junitClass;

import java.time.LocalDate;

public class Q15_Item 
{
	public boolean check(int itemid) {
		int count=0;
		while(itemid>0)
		{
			itemid=itemid/10;
			count++;
		}
		if(count>=3)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public boolean alpha(String itemname)
	{
	if(itemname.matches("[a-zA-Z]+"))
		{
			return true;
		}else
		{
			return false;
		}
	}
	public boolean contain(int cost_price)
	{
		if(cost_price>=0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public boolean doe_check(LocalDate doe)
	{
		if(doe.compareTo(LocalDate.now())!=0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	public boolean same(int cost_price, int sell_price)
	{
		if(cost_price!=sell_price)
		{
			return true;
		}else
		{
			return false;
		}
	}
}
