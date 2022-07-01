package junitClass;

public class Q12
{
	public static class Item implements Cloneable
	{
		int id;
		String name;
		public Item(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Object clone() throws CloneNotSupportedException
		{
			return super.clone();
		}
		public static boolean checkClone(Item i1, Item i2)
		{
			if(i1.id==i2.id && i1.name==i2.name)
			{
				return true;
			}else
			{
				return false;
			}
		}
	}
}
