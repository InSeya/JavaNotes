import java.util.Scanner;
public class PositiveNegativearray
{
public static void main(String[] args)
{
int c=0,d=0;
int n,m;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of rows :");
n=sc.nextInt();
System.out.println("Enter the number of columns :");
m=sc.nextInt();
int s[][]=new int[n][m];
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
	System.out.println("Enter elements : ");
	s[i][j]=sc.nextInt();
	}
	}
	System.out.println("Positive elements are : ");
	for(int i=0;i<s.length;i++)
	{
	for(int j=0;j<s.length;j++)
	if(s[i][j]>=0)
	{
	System.out.println(s[i][j]);
	c++;
	}
}
	System.out.println("Negative elements are : ");
	for(int i=0;i<s.length;i++)
	{
	for(int j=0;j<s.length;j++)
	if(s[i][j]<0)
	{
	System.out.println(s[i][j]);
	d++;
	}
}
	System.out.println("Count of positive elements : " + c);
	System.out.println("Count of negative elements : " + d);
	}
}
	