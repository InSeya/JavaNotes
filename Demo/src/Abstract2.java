import java.util.Scanner;

public class Abstract2 {
    public static void main(String[] args) {
        CompoundInterest compoundInterest = new CompoundInterest();
        SimpleInterest simpleInterest = new SimpleInterest();
        compoundInterest.PrintInterest();
        simpleInterest.PrintInterest();
    }
    static abstract class Interest{
        int principal;
        int duration;
        abstract public void PrintInterest();
    }
    static class CompoundInterest extends Interest{
        public void PrintInterest(){
            double rateOfInterest = 8;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the Principal: ");
            principal = scanner.nextInt();

            System.out.println("The Rate of Interest: " + rateOfInterest);

            System.out.print("Enter the Duration (in years): ");
            duration = scanner.nextInt();

            double compound_interest = principal * Math.pow(1 + (rateOfInterest / 100), duration);

            System.out.println("-------------------------");
            System.out.println("Principal: " + principal);
            System.out.println("Interest Rate: " + rateOfInterest);
            System.out.println("Time Duration: " + duration);
            System.out.println("Compound Interest: " + compound_interest);
        }
    }
    static class SimpleInterest extends Interest{
        public void PrintInterest(){
            double rateOfInterest = 8;
            Scanner scanner = new Scanner(System.in);

            System.out.println("---------------------------");
            System.out.print("Enter the Principal: ");
            principal = scanner.nextInt();

            System.out.println("The Rate of Interest: " + rateOfInterest);

            System.out.print("Enter the Duration (in years): ");
            duration = scanner.nextInt();

            double compound_interest = (principal * rateOfInterest * duration) / 100;

            System.out.println("-------------------------");
            System.out.println("Principal: " + principal);
            System.out.println("Interest Rate: " + rateOfInterest);
            System.out.println("Time Duration: " + duration);
            System.out.println("Simple Interest: " + compound_interest);
        }
    }
}
