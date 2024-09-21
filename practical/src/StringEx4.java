import java.util.*;
interface StringDemo
{
    public void check(String s1,String s2);
}
class StringCheck implements StringDemo
{
    public void check(String s1,String s2)
    {         
        if(s1.compareTo(s2)==0)
        {
            System.out.println("Both String are same.");
        }
        else
        {
            System.out.println("Both String are different.");
        } 
    }
}
public class StringEx4
{ 
    public static void main(String args[])
    {  
        String s1;
        String s2;
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter firt string: ");  
        s1= sc.nextLine(); 
        System.out.print("Enter second string: ");  
        s2= sc.nextLine();              
        StringDemo sd=new StringCheck();
        sd.check(s1,s2);
    }
}
