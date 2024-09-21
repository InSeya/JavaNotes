import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class AWT extends JFrame implements ActionListener { JPanel p, p1, p2;
JLabel name, pass; String a, b;
int attempts = 0; JTextField t1, t2; JButton b1, b2; public AWT() {
setTitle("MY Network"); setSize(800, 760);
GridBagLayout gb = new GridBagLayout(); GridBagConstraints c = new GridBagConstraints(); setLayout(gb);
window close = new window(); addWindowListener(close);
p = new JPanel(); c.gridx = 1;
c.gridy = 1; gb.setConstraints(p, c); add(p);
name = new JLabel("Username"); c.gridx = 1;
c.gridy = 1; gb.setConstraints(name, c); p.add(name);
t1 = new JTextField(20); c.gridx = 1;
c.gridy = 2;

gb.setConstraints(t1, c); p.add(t1);
p1 = new JPanel(); c.gridx = 1;
c.gridy = 2; gb.setConstraints(p1, c); add(p1);
pass = new JLabel("Password"); c.gridx = 1;
c.gridy = 2; gb.setConstraints(pass, c); p1.add(pass);
t2 = new JTextField(20); c.gridx = 1;
c.gridy = 2; gb.setConstraints(t2, c); p1.add(t2);
p2 = new JPanel(); c.gridx = 1;
c.gridy = 3; gb.setConstraints(p2, c); add(p2);
b1 = new JButton("LOGIN"); c.gridx = 1;
c.gridy = 3; gb.setConstraints(b1, c); p2.add(b1);
b2 = new JButton("CLEAR");
c.gridx = 1;
c.gridy = 4; gb.setConstraints(b2, c); p2.add(b2); b1.addActionListener(this); b2.addActionListener(this);
}
class LoginException extends Exception { LoginException() {
JOptionPane.showMessageDialog(null, "Exception!!! Invalid Username or Password");
}
}
public void actionPerformed(ActionEvent e) { String cmd = e.getActionCommand();
try {
if (cmd.equals("LOGIN")) { a = t1.getText();
b = t2.getText();
if ((a.equals("Aaisha")) && (b.equals("1234"))) { JOptionPane.showMessageDialog(null, "Suffesfully Login");
} else { attempts++;
if (attempts >= 3) { b1.setEnabled(false);
JOptionPane.showMessageDialog(null, "Limit is exceeded Try After Sometime");
} else {
 


throw new LoginException();

}

}

}

} catch (Exception er) {System.out.println(er);} if (cmd.equals("CLEAR")) {
t1.setText("");

t2.setText("");

}

}

public class window extends WindowAdapter { public void windowClosing(WindowEvent e) { System.exit(0);
}
}
public static void main(String a[]) { AWT fb = new AWT(); fb.setVisible(true);
}
} 