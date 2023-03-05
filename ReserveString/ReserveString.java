import java.util.Scanner;
class Reverse
{
	void Num()
	{
		
		System.out.print("Enter the String");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char ch[] = str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		
		}
		
		System.out.println("The reverse of a number:"+rev);
	}
}
class ReserveString 
{
	public static void main(String[] arg)
	{
		Reverse r = new Reverse();
		r.Num();
	}
}