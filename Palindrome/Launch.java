import java.util.Scanner;

class CheckPlaindrome
{
	void str()
	{
		System.out.print("Enter a String");
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		int j=str.length()-1;
		boolean isPalindrome = true;
		for(int i=0;i<j;i++)
		{
			if (str.charAt(i)!=str.charAt(j))
			{
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome)
			{
				System.out.print("palindrome");
				
			}
			else
			{
				System.out.print("not a palindrome");
			}
	}
}

public class Launch
{
	public static void main(String[] args)
	{
		CheckPlaindrome c = new CheckPlaindrome();
		c.str();
	}
}

