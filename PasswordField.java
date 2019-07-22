import javax.swing.*; import java.awt.*; import java.awt.event.*;
import java.util.Arrays; //needed to compare char[] from password field

public class PasswordField extends JPanel implements ActionListener {
  JPasswordField p;
  JTextField u;
  
  public static void main (String[] args){
    PasswordField content = new PasswordField();
    
    JFrame window = new JFrame("Password Field");
    window.setContentPane( content);
    window.setSize(200,150);
    window.setLocation( 100, 100);
    window.setVisible(true);
  }//end main
  
  public PasswordField (){
    JLabel name = new JLabel ("username:");
    JLabel pass = new JLabel ("password:");
    u = new JTextField (5);
    p = new JPasswordField (5);
    Panel pan1 = new Panel();
    pan1.setBackground (Color.yellow);
    pan1.add (name);
    pan1.add (u);
    add (pan1);
    Panel pan2 = new Panel();
    pan2.setBackground (Color.green);
    pan2.add (pass);
    pan2.add (p);
    add (pan2);    
    JButton done = new JButton ("Done");
    done.setActionCommand ("Done");
    done.addActionListener(this);
    add (done);
/*    setLayout (new BorderLayout ());    
    add(pan1, "North");
    add(pan2, "Center");
    add (done, "South");*/   
  }//end constructor
  
  public void actionPerformed (ActionEvent e){
    //getPassword() returns character array, not String, so need to use Arrays.equals()
    if (u.getText().equals ("cookit") 
          && Arrays.equals("computer".toCharArray(), p.getPassword())) {    
      JOptionPane.showMessageDialog (null, "Welcome", "Welcome", 
                                     JOptionPane.INFORMATION_MESSAGE);
    } else {
      JOptionPane.showMessageDialog (null, "Unauthorized Access", 
                                     "Incorrect Log on",
                                     JOptionPane.ERROR_MESSAGE);
    }
    p.setText ("");
    u.setText ("");
  }//end actionPerformed
}//end class