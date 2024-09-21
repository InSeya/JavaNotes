import java.util.Scanner;
public class SumRowD
{
public static void main(String[] args)
{
int n,m,rows,cols,c;
Scanner sc= new Scanner(System.in); System.out.println("Enter the number of rows :"); n=sc.nextInt();
System.out.println("Enter the number of columns :"); m=sc.nextInt();
int s[][]=new int[n][m]; for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{

System.out.println("Enter element : "); s[i][j]=sc.nextInt();
}
}
rows=s.length; cols=s[0].length; for(int i=0;i<rows;i++)
{
c=0;
for(int j=0;j<cols;j++)
{
 

c=c+s[i][j];
}
System.out.println("Sum of "+ (i+1) +" row :"+c);
}
}
}

