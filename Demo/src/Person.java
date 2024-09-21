import java.util.*;

public class Person{
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.getInfo();
		obj.printInfo();
	}
}

       class Demo{
		String name, gender;
		int age;
		void getInfo() {
			Scanner s=new Scanner (System.in);
			System.out.println("Enter the name:");
			name=s.nextLine();
			System.out.println("Enter the gender:");
		    gender=s.nextLine();
			System.out.println("Enter the Age:");
			age=s.nextInt();
		}
		void printInfo() {
			System.out.println("Your name is:" +name);
			System.out.println("Your gender is:" +gender);
			System.out.println("Your Age is:" +age);
		}

	}	