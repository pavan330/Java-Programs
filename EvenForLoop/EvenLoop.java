import java.util.Scanner;

class EvenNum
{

int n;
void cal()
{

System.out.print("Enter the array element size");
Scanner scan = new Scanner(System.in);
n=scan.nextInt();
int arr[]= new int[n];

System.out.print("Enter the array element");
for(int i=0;i<n;i++)
{
arr[i]=scan.nextInt();
}


for(int i=0;i<n;i++)
{
if(arr[i]%2==0)
{
System.out.println("Number is even are:"+arr[i]);
}
}

for(int i=0;i<n;i++)
{
if(arr[i]%2!=0)
{
System.out.println("Number is odd are:"+arr[i]);
}
}
}
}

class EvenLoop
{
public static void main(String[] args)
{
EvenNum e = new EvenNum();
e.cal();
}
}
