class Pattern
{
	void draw()
	{
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=1*(n-i);j>=0;j--)
			{
			System.out.print(" ");
			}
			for (int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
}
class Pattern3
{
	public static void main(String[] args)
	{
		Pattern p= new Pattern();
		p.draw();
	}
}