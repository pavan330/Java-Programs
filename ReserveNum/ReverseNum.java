import java.util.Scanner;

class Reverse
{
	void cal()
	{
		System.out.print("Enter the number");
		Scanner scan =  new Scanner(System.in);
		int n=scan.nextInt();
		int rev=0;
		int rem;	
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("The reverse of a number"+rev);
	}
}
class ReverseNum
{
	public static void main(String[] args)
	{
		Reverse r = new Reverse();
		r.cal();
	}
}