import java.util.*;
interface Stack1
{	
    public void display(); 
}
class StringStack implements Stack1
{
    Stack<String> STACK = new Stack<String>();
    public void display()
    {    
        STACK.push("Aaisha");
        STACK.push(" Qazi");
        STACK.push("70");
        STACK.push("Ayesha"); 
        System.out.println("Stack After Push Element: " + STACK);    
        System.out.println("Popped element: " + STACK.pop());
        System.out.println("Popped element: " + STACK.pop());
        System.out.println("Stack After Pop Element: " + STACK);
    }
}
public class Stringpp
{
public static void main(String args[])
    {
       Stack1 st=new StringStack();
       st.display();
    }
}

