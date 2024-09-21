package MCA;

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
public class Mathematics {
public float a, b, c;
public int p, q;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public int add_i() { 
	try {
System.out.println("Enter two integers");
p = Integer.parseInt(br.readLine());
q = Integer.parseInt(br.readLine());
} catch (Exception ex) {
	System.out.println(ex);} return (p + q);
}
public float add_f() { try {
System.out.println("Enter three floats"); 
a = Float.parseFloat(br.readLine());
b = Float.parseFloat(br.readLine()); 
c = Float.parseFloat(br.readLine());
} catch (Exception e) {System.out.println(e);} 
return (a + b + c);
}
}
