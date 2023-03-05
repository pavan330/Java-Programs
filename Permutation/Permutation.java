import java.util.Scanner;

class Num
{

      void cal()
	{
		int n,per,fact1,fact2;
		System.out.println("Enter the number of n and r");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int r=scan.nextInt();
		fact1=n;
		for(int i=n-1;i>=1;i--)
		{
			fact1=fact1*i;
		}
		int num;
		num=n-r;
		fact2=num;
		for(int i=num-1;i>=1;i--)
		{
			fact2=fact2*i;
		}
		per=fact1/fact2;
		System.out.print("npr="+per);
	}
}
class Permutation
{
	public static void main(String args[])
	{
		Num n= new Num();
		n.cal();
	}
}