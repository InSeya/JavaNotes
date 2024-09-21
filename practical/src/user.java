class MyException1 extends Exception {
}
// A Class that uses above MyException
public class user {
// Driver Program
public static void main(String args[])
{
try {
// Throw an object of user defined exception
throw new MyException1();
}
catch (MyException1 ex) {
System.out.println("Caught");
System.out.println(ex.getMessage());
}
}
}