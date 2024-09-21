import java.util.Scanner;
import java.math.*;
public class Students{
	public static void main(String[] args) {
	Details d=new Details();
	d.getInfo();
	d.printInfo();
	d.result();
	}
}
 	class Details{
		String name;
		int Rollno, mark1,mark2,mark3,avg,percentage;
	public void getInfo() {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the name:");
		name=s.nextLine();
		System.out.println("Enter the Rollno:");
		Rollno=s.nextInt();
		System.out.println("Enter the Mark1:");
		mark1=s.nextInt();
		System.out.println("Enter the Mark2:");
		mark2=s.nextInt();
		System.out.println("Enter the Mark3:");
		mark3=s.nextInt();
	}
	void printInfo() {
		System.out.println("Your name is:" +name);
		System.out.println("Your Rollno is:" +Rollno);
		System.out.println("Your Marks for Subject 1 is :" +mark1);
		System.out.println("Your Marks for Subject 2 is :" +mark2);
		System.out.println("Your Marks for Subject 3 is :" +mark3);
		}
	void result() {
		 avg=mark1+mark2+mark3;
		 percentage=avg*100/300;
		 System.out.println("Percentage of your result is:" +percentage);
	}
 }