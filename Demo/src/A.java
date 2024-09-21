public class A{
public static void main(String[] args) {
	B obj=new B();
	obj.square();
	obj.sum();
	}
}
class Av{
	 int a=4;
	public void square() {
		int ar=a*a;
		System.out.println(ar);
	}
}
class B extends Av{
	void sum() {
		int s=a+a;
		System.out.println(s);
	}
}