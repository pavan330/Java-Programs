import java.util.Scanner;

class Sub
{
      int i,j;
	int CalculateString()
	{
		String s;
		System.out.println("Enter the String");
		Scanner scan =new Scanner(System.in);
		s=scan.nextLine();
		int n=s.length();
		String rev="";
		for (int i=n-1; i>0; i--)
		{
			rev+=s.charAt(i)+"";
		} 
		String st=new int[n+1][n-1];
		for(int j=1;j<n+1;j++)
		{
			if(s.charAt(i-1)==rev.charAt(j-1))
			{
				st[i][j] = st[i-1][j-1]+1;
			}
			else
			{
				st[i][j]=Math.max(st[i][j], st[i-1][j]);
			}
		}
		return st[n][n];
	}
		
}
class Substring
{
public static void main(String[] args)
{
Sub sb = new Sub();
sb.CalculateString();
}
}


class Solution {
    public String longestPalindrome(String s) {
        boolean dp[][]=new boolean[s.length()][s.length()];

        String ans="";
        int maxLength=0;
        for(int g=0;g<s.length();g++)
        {
            for(int i=0,j=g;j<s.length();i++,j++)
            {
                if(g==0)
                {
                    dp[i][j]=true;
                }
                else if(g==1)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        dp[i][j]=true;
                    }
                    else
                    {
                        dp[i][j]=false;;
                    }
                }
                else
                {
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1])
                    {
                        dp[i][j]=true;
                    }
                    else
                    {
                        dp[i][j]=false;
                    }
                }

                if(dp[i][j])
                {
                    if(j-i+1>maxLength)
                    {
                        maxLength=j-i+1;
                        ans=s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
}