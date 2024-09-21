import java.util.Scanner;
public class PositiveNegative{
public static void main(String[] args){ int c=0,d=0;
int n;
Scanner sc= new Scanner(System.in); System.out.println("Enter the number of elements:"); n=sc.nextInt();
int s[]=new int[n]; for(int i=0;i<n;i++){
System.out.println("Enter elements : "); s[i]=sc.nextInt();
}
System.out.println("Positive elements are : "); for(int i=0;i<s.length;i++){
if(s[i]>=0){
System.out.println(s[i]); c++;
}
}
System.out.println("Negative elements are : "); for(int i=0;i<s.length;i++){
if(s[i]<0){
System.out.println(s[i]); d++;
}
}
System.out.println("Count of positive elements : " + c); System.out.println("Count of negative elements : " + d);

}
}
