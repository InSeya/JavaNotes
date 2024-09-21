import java.util.*;
public class HashTableDemo {
public static void main(String[] args) 
{
	Hashtable<String,String> h=new Hashtable<String,String>();
h.put("Biryani","Chicken");
h.put("Icecream","Vanila");
h.put("Colddrink","Zeera"); 
Enumeration<String> e=h.elements(); 
while(e.hasMoreElements())
{
System.out.println (e.nextElement());
}
System.out.println ("	");
Set<Map.Entry<String,String>> s=h.entrySet();
System.out.println (s);
System.out.println ("	");
 
Enumeration<String> e1=h.keys(); 
while(e1.hasMoreElements())
{
System.out.println (e1.nextElement());
}
System.out.println ("	");
Set<String> s1=h.keySet(); 
System.out.println (s1); 
System.out.println ("	");
Collection<String> c=h.values(); 
System.out.println (c);
}
}
