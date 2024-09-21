
import java.util.*;
import java.lang.*;
import java.io.*;
public class ArrayListDemo1 {
public static void main(String[] args) {
ArrayList<String> ar = new ArrayList<>();
System.out.println(ar.isEmpty());
System.out.println(ar.size());
ar.add("P");
ar.add("Q");
ar.add("R");
ar.add("S");
ar.add("T");
System.out.println(ar.size());
System.out.println(ar);
ar.add(1, "A");
System.out.println(ar);
System.out.println(ar.contains("A"));
System.out.println(ar.contains("B"));
System.out.println(ar.get(1));
ar.remove(1);
System.out.println(ar);
ar.remove("R");
System.out.println(ar);
//System.out.println(al.IndexOf("R"));//r
ar.add("R");//c
System.out.println(ar);
//System.out.println(al.IndexOf("c"));
System.out.println(ar.lastIndexOf("R"));
ar.set(4, "T");
System.out.println(ar);
Object arr[] = ar.toArray();
for (int i = 0; i < arr.length; i++) {
System.out.println((String) arr[i]);
}
ArrayList<String> all = new ArrayList<>();
all.add("L");
all.add("M");
all.add("N");
all.add("O");
System.out.println(ar);
ar.addAll(all);
System.out.println(ar);
System.out.println(ar.containsAll(all));
ar.remove("A");
System.out.println(ar.containsAll(all));
Iterator itr = ar.iterator();
while (itr.hasNext()) {
System.out.println(itr.next() + "");
}
System.out.println("--------------");
ListIterator litr = ar.listIterator();
while (litr.hasNext()) {
System.out.println(litr.next());
}
System.out.println("------------");
while (litr.hasPrevious()) {
System.out.println(litr.previous());
}
}
}