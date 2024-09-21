import java.util.*; class Tree{
public static void main(String args[])
{
	TreeSet<String> al=new TreeSet<>();
	al.add("Java");
al.add("Data Structure");
al.add("Network Technologies"); 
al.add("Operating System"); 
al.add("Code Ignitor");
al.add("PL/SQL"); 

Iterator<String> itr=al.iterator(); 
while(itr.hasNext())
{
	System.out.println(itr.next());
}

}

}
