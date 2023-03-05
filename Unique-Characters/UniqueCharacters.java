import java.util.Scanner;

class Character
{
	void unichar()
	{
		String str=""; 
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		str=scan.nextLine();
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			int temp=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j) && i!=j)
				{
						temp=1;
						break;
				}
			 }
			 if(temp == 0)
				{
				System.out.print(str.charAt(i));
				}

		}
	}
}
class UniqueCharacters
{
	public static void main(String args[])
	{
	Character c = new Character();
	c.unichar();
	}
}