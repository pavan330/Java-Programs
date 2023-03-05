class Patter
{
	void draw()
	{
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n-(i+1);j++)
			{
			System.out.print("*");
			}
			
                System.out.println();
		}
		
	}
}
class Pattern4
{ 
	public static void main(String[] args)
	{
		Patter p = new Patter();
		p.draw();
	}
}