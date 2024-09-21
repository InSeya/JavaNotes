import java.util.*; 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
class MySwing extends JFrame
{
Random rand;
Color randomColor;
MySwing()
{
super("Change Color on Terminate"); 
setLayout(new FlowLayout()); 
setSize(500,500); 
setVisible(true);
addWindowListener(new MyClose()); 
setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}
class MyClose extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
rand = new Random(); 
float r = rand.nextFloat();
float g = rand.nextFloat();
float b = rand.nextFloat();
randomColor = new Color(r, g, b);
repaint();
}
}
public void paint(Graphics g)
{
getContentPane().setBackground(randomColor);
}
}
class FrameColor
{
public static void main(String[] args) { MySwing obj= new MySwing();
}
}

