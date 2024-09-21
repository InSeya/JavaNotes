import java.util.*;
class HashMapDemo
{
public static void main(String args[])
{
// Create a hash map.
HashMap<String, Double> hm = new HashMap<String, Double>();
// Put elements to the map
hm.put("Aaisha Qazi",(7070.45));
hm.put("Abc xyz", (125.20));
hm.put("Ruby Sinha",(1588.00));
hm.put("Satyam T", (85.92));
hm.put("Sia Ford", (-39.58));
System.out.println (hm);
// Get a set of the entries.
Set<Map.Entry<String,Double>>set = hm.entrySet();
// Display the set.
Iterator itr=set.iterator();
while(itr.hasNext())
{
Object mobj=itr.next();
System.out.println (mobj);
// Map.Entry me=(Map.Entry)mobj;
// System.out.print(me.getKey() + ": ");
// System.out.println(me.getValue());
}
Set s1=hm.keySet();
Object kobj[]=s1.toArray();
for(int i=0;i<kobj.length;i++)
{
Object vobj=hm.get(kobj[i]);
String io=(String)kobj[i];
Double d=(Double)vobj;
System.out.println (io+"..............."+d);
}
// Deposit 1000 into Sara Harding 's account.
double balance = hm.get("Aaisha Qazi");
hm.put("Aaisha Qazi ", balance + 1000);
System.out.println("Aaisha Qazi 's new balance: " +
hm.get("Aaisha Qazi "));
}
}