import java.util.Scanner; public class array
{
public static void main(String[] args)
{
int c=0,d=0; int n;
Scanner sc= new Scanner(System.in); System.out.println("Enter the number of elements:"); n=sc.nextInt();
int s[]=new int[n]; for(int i=0;i<n;i++)
{
System.out.println("Enter elements : "); s[i]=sc.nextInt();
}
System.out.println("Odd Numbers are : "); for(int i=0;i<s.length;i++)
{
if(s[i]%2!=0)
{
System.out.println(s[i]); c++;
}
		}
	System.out.println("Even Numbers are : "); 
	for(int i=0;i<s.length;i++)
	{
		if(s[i]%2==0)
		{
			System.out.println(s[i]); d++;
			}
		}
	System.out.println("Count of Odd numbers : " + c); 
	System.out.println("Count of Even numbers : " + d);

	}
}
 
