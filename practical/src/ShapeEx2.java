import java.util.*;
abstract class shaped 
{
    int length, breadth, radius,Side;
    Scanner input = new Scanner(System.in);
    abstract void printArea();
}
class Rectangle extends shaped 
{
    void printArea() 
    {
        System.out.println("Area of Rectangle:");
        System.out.print("Enter length and breadth: ");
        length = input.nextInt();
        breadth = input.nextInt();
    System.out.println("The area of Rectangle is: " + length * breadth);
    }
}
class Square extends shaped 
{
    void printArea() 
    {
        System.out.println("Area of Square:");
        System.out.print("Enter side: ");
        Side = input.nextInt();
        System.out.println("The area of Square is: " + Side*+Side);
    }
}
class Cricle extends shaped 
{
    void printArea() 
    {
        System.out.println("Area of Cricle:");
        System.out.print("Enter Radius: ");
        radius = input.nextInt();
    System.out.println("The area of Cricle is: " + 3.14f * radius * radius);
    }  }
public class ShapeEx2 {
    public static void main(String[] args) 
    {
        Rectangle rec = new Rectangle();
        rec.printArea();
        Square tri = new Square();
        tri.printArea();
        Cricle cri = new Cricle();
        cri.printArea();
    }
   }
