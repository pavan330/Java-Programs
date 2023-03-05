class Patter
{
	void draw()
	{
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
			System.out.print("*");
			}
                System.out.println();
		}
	}
}
class Patern1
{ 
	public static void main(String[] args)
	{
		Patter p = new Patter();
		p.draw();
	}
}