
 class StringIndexOutOfBound_Demo
{
    public static void main(String args[])
    {
        try
         {
            String a = "Hi This is Aaisha "; 
            char c = a.charAt(20); 
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) 
        {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
