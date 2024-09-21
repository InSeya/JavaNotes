import MCA.Mathematics; import MCA.Maximum; class MathMin {
public static void main(String args[]) { Mathematics m = new Mathematics();
System.out.println("Addition of two integers is " + m.add_i()); System.out.println("Addition of three floats is " + m.add_f()); Maximum m1 = new Maximum(); System.out.println("Maximum amongst three integers is " + m1.check_max());
}
}


