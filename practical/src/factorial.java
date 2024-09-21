class NewThread implements Runnable
{
int n=7,f=1;
Thread t;
NewThread()
{
t=new Thread(this,"factorial");
System.out.println("Main thread "+t);
t.start();
}
public void run()
{
try
{
while(n>0)
{
f=f*n;
n=n-1;
}
System.out.println(f);
Thread.sleep(100);
}
catch(InterruptedException e)
{
System.out.println("Exception");
}
System.out.println("Exiting the Main thread!!");
}
}
class factorial
{
public static void main(String args[])
{
new NewThread();
new NewThread1();
System.out.println("Exiting the main thread!!");
}
}
class NewThread1 implements Runnable
{
Thread Th1;
NewThread1()
{
Th1=new Thread(this,"Prime number");
System.out.println("Th1 is created"+Th1);
Th1.start();
}
public void run()
{
int i=2,no=25 ,flag=1;
try
{
int n2= no/2;
if(n2==0)
System.out.println("no.is not prime");
else
System.out.println("no.is prime");
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println("Exception");
}
}
}