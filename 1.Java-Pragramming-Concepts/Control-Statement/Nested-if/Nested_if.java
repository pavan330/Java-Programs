class Marks
{
	void cal()
	{
		int x;
		x=50;
		if(x==10)
		{
			
			if(x==20)
			{
				System.out.print("This is 20");
			}
			else if(x==30)
			{
				System.out.print("This is 30");
			}
		}
			else
			{
				System.out.print("This is 50");
			}
	}
}

public class Nested_if
{
	public static void main(String[] args)
	{
		Marks m = new Marks();
		m.cal();
	}
}