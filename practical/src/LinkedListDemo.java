import java.util.*; class LinkedListDemo
{
public static void main(String args[])
{
LinkedList ll=new LinkedList(); System.out.println (ll.size());

ll.add("P");
ll.add("Q");
ll.add("R");
ll.add("S");
ll.add("T");

System.out.println (ll);

ll.addFirst("A"); System.out.println (ll);

ll.addLast("B"); System.out.println (ll);

System.out.println (ll.contains("A")); System.out.println (ll.contains("M"));

ll.removeFirst(); System.out.println (ll);

ll.removeLast(); System.out.println (ll);

System.out.println (ll.getFirst()); System.out.println (ll.getLast());

Iterator itr=ll.iterator(); while(itr.hasNext())
{
System.out.println (itr.next());
}

ListIterator litr=ll.listIterator(); while(litr.hasNext())
 

{
System.out.println (litr.next());
}

while(litr.hasPrevious())
{
System.out.println (litr.previous());
}
}
}
