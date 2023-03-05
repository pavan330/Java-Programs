import java.util.Scanner;

class FindSquare
{
	void cal()
	{
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b= a*a;
		System.out.print("Square root of a number"+b);
	}
}
class SquareRoot
{
	public static void main(String[] args)
	{
		FindSquare f = new FindSquare();
		f.cal();
	}
}