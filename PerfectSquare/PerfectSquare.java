import java.util.Scanner;

class FindSquare
{
    void cal()
    {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 1;
        while (i * i <= num) 
	  {
            if (i * i == num) 
		{
                System.out.println("Yes, it is a perfect square.");
                return;
            }
            i++;
        }
        System.out.println("No, it is not a perfect square.");
    }
}
class PerfectSquare
{
    public static void main(String[] args)
    {
        FindSquare f = new FindSquare();
        f.cal();
    }
}
