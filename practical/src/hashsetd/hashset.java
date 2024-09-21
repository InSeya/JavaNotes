package hashsetd;
import java.util.*;
public class hashset {
public static void main(String[] args) 
{
	LinkedHashSet<String> hs=new LinkedHashSet<>();
hs.add("Linux");
hs.add("Windows");
hs.add("DOS");
hs.add("Unix");
hs.add("Android"); System.out.println (hs);
System.out.println (hs.add("Linux"));
System.out.println (hs.contains("Linux")); hs.remove("Linux");
System.out.println (hs); 
Iterator itr=hs.iterator();
while(itr.hasNext())
{
System.out.println (itr.next());
}
hs.clear(); System.out.println (hs);
}
}
