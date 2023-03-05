class Marks
{
	void cal()
	{
		int x=20;
		if(x==5)
		{
			System.out.print("x is 5");
		}
		else if(x==10)
		{
			System.out.print("x is 10");
		}
		else if(x==15)
		{
			System.out.print("x is 15");
		}
		else
		{
			System.out.print("X is 200");
		}
	}
}
public class If_Else_If //if-else-if
{
	public static void main(String[] args)
	{
		Marks m = new Marks();
		m.cal();
	}
}
