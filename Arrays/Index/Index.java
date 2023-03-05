import java.util.Scanner;

class FindIndex
{
	void cal()
	{
		int n;
		System.out.print("Enter the array size");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt(); 
		int arr[] = new int[n];
		System.out.print("Enter the array element");
		for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}

		System.out.print("Enter the element to find");
		int element = scan.nextInt();
		for(int j=0;j<arr.length;j++)
		{
				if(arr[j]==element)
				{
					System.out.println("Index of"+element+"is:"+j);
					break;
				}
		}
			
	}
}

class Index
{
	public static void main(String[] args)
	{
		FindIndex f = new FindIndex();
		f.cal();
	}
}