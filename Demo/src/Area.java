import java.util.*;
import java.math.*;
public class Area{
	public static void main(String[] args) {
		Square sq= new Square();
		sq.Area();
		Triangle tr= new Triangle();
		tr.Area();
		Circle c= new Circle();
		c.Area();	
	}
		static abstract class Shape{
		int a, b;
		abstract public void Area();
	}
		static class Square extends Shape {
			public int areaofSquare;
			public void Area() {
				Scanner sc=new Scanner(System.in);
				System.out.println("");
				System.out.println("Enter the Side of Square: ");
				a=sc.nextInt();
				areaofSquare=a*a;
				System.out.println("The side of Square is: " +a);
				System.out.println("The area of Square is: " +areaofSquare);
			}
		}
		static class Triangle extends Shape{
			double  areaofTriangle;
			public void Area() {
				Scanner sc=new Scanner(System.in);
				System.out.println("");
				System.out.println("Enter the Height of Triangle: ");
				a=sc.nextInt();
				System.out.println("Enter the Base of Triangle: ");
				b=sc.nextInt();
				System.out.println("The Height of a Triangle is " +a+ " And base of a triangle is "+b);
				areaofTriangle= (0.5*a *b);
				System.out.println("The area of Triangle is: " +areaofTriangle);
			}
		}
		static class Circle extends Shape {
			double areaofCircle;
			public void Area() {
				Scanner sc=new Scanner(System.in);
				System.out.println("");
				System.out.println("Enter the radius: ");
				a=sc.nextInt();
				areaofCircle= (3.14*a*a);
				System.out.println("The radius of Circle is: " +a);
				System.out.println("The area of Circle is: " +areaofCircle);
			}
		}
}