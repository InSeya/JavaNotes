
import java.util.StringTokenizer;  
public class StringT
{  
 public static void main(String args[])
 {  
   StringTokenizer st = new StringTokenizer("Aaisha"," ");  
     while (st.hasMoreTokens())
    {  
         System.out.println(st.nextToken());  
     }  
   }  
}

