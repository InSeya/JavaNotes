public class Perfect  
{  
//function checks if the given number is perfect or not  
static boolean isPerfectNumber(int num)  
{  
//variable stores the sum of divisors  
int sum = 1;  
//determines all the divisors of the given number and adds them  
for (int i = 2; i * i <= num; i++)  
{  
if (num % i==0)  
{  
if(i * i != num)  
sum = sum + i + num / i;  
else  
//calculates the sum of factors  
sum = sum + i;  
}  //end of if  
}  //end of for  
if (sum == num && num != 1)  
//returns true if both conditions (above) returns true  
return true;  
//returns false if any condition becomes false  
return false;  
} //end of function  
//driver code  
public static void Perfect ()  
{  
System.out.println("Perfect Numbers between 1 to 100 are: ");  
//loop executes until the condition n<100 becomes false  
for (int n = 1; n < 100; n++)  
//calling function  
if (isPerfectNumber(n))  
//prints all perfect number between given range  
System.out.println(n +" is a perfect number");  
}  
} 	