import java.util.Scanner;

public class Person{
	public static void main(String[] args) {
		Demo p = null;
		p.getData();
		p.printInfo();
	}
}


public class Demo {
		String name, gender;
		int age;
		void getData() {
			Scanner s=new Scanner (System.in);
			System.out.println("Enter the name:");
			String name=s.nextLine();
			System.out.println("Enter the gender:");
			String gender=s.nextLine();
			System.out.println("Enter the Age:");
			age=s.nextInt();
		}
		void printInfo() {
			System.out.println("Your name is:" +name);
			System.out.println("Your gender is:" +gender);
			System.out.println("Your Age is:" +age);
		}
}
	