package MCA;
import java.io.BufferedReader; 
import java.io.InputStreamReader;
public class Maximum {
int x, y, z, max;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public int check_max() { try {
System.out.println("Enter three integers"); x = Integer.parseInt(br.readLine());
y = Integer.parseInt(br.readLine()); z = Integer.parseInt(br.readLine()); if (x > y && x > z)
max = x; else if (y > z) max = y; else
max = z;
} catch (Exception e) {System.out.println(e);} return max;
}
 


}
