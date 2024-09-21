	import java.util.*;
	import java.util.concurrent.LinkedBlockingQueue;
	 
	public class GFG
	{
	    public static void main(String[] argv)
	        throws Exception
	    {
	        StringBuilder str
	            = new StringBuilder();
 
	        str.append("Qazi");
	
	        System.out.println("String = " + str.toString());
	 
	        StringBuilder str1
	            = new StringBuilder("Aaisha");
	
	        System.out.println("String1 = " + str1.toString());
	
	        StringBuilder str2 = new StringBuilder(10);
	 
	      
	        System.out.println("String2 capacity = "  + str2.capacity());
	        StringBuilder str3 = new StringBuilder(str1.toString());
	        System.out.println("String3 = " + str3.toString());
	    }
	}
