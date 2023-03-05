import java.util.Scanner;

class EvenNumber
{
	int num;
	int even;
	void cal()
	{
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();  
		if (num%2==even)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is not even");
		}
	}
}

class LaunchEven
{
	public static void main(String[] args)
	{
		EvenNumber e = new EvenNumber();
		e.cal();
	}
}
