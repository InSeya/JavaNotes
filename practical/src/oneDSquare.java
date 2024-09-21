import java.util.Scanner;

public class oneDSquare
	{
public static void main(String[] args)
	{
		int n;
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the number of elements"); 
		n=sc.nextInt();
		int s[]=new int[n]; 
		for(int i=0;i<n;i++)
			{
				System.out.println("Enter elements : ");
				s[i]=sc.nextInt();
					}
		for(int i=0;i<s.length;i++)
			{
				s[i]=s[i]*s[i];
			}

System.out.println("Squre of each elemet : "); 
for(int i=0;i<s.length;i++)
{
System.out.println(s[i]+" ");
		}
	}
}