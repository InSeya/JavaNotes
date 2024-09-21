class exceptionp extends Exception
{
public String toString()
{
return "User-Defined Exception";
}
public static void main(String args[])
{
exceptionp obj= new exceptionp();
try
{
throw obj;
}
catch(exceptionp e)
{
System.out.println("Exception handled - "+ e);
}
}
}