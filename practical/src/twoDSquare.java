import java.util.*; 
public class twoDSquare
{
public static void main(String[] args)
{
int n,m;
Scanner sc= new Scanner(System.in); System.out.println("Enter the number of rows :"); n=sc.nextInt();
System.out.println("Enter the number of columns :"); m=sc.nextInt();
int s[][]=new int[n][m]; for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{

System.out.println("Enter elements : "); s[i][j]=sc.nextInt();
}
}
for(int i=0;i<s.length;i++)
{
for(int j=0;j<s.length;j++)
{
s[i][j]=s[i][j]*s[i][j];
}
}
System.out.println("Square of each element : "); for(int i=0;i<s.length;i++)
{
for(int j=0;j<s.length;j++)
{
System.out.println(s[i][j]+" ");
}
}
}
}
 
