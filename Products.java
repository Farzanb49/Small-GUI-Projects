import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Products extends JPanel implements ActionListener {
  // Place instance variables here
  JTextField num1,num2;
  JLabel calc;    
  
  public static void main (String[] args){
    Products content = new Products();
    
    JFrame window = new JFrame("Products");
    window.setContentPane( content);
    window.setSize(300,100);
    window.setLocation( 100, 100);
    window.setVisible(true);
  }//end main
  
  public Products () {
    num1 = new JTextField(6);
    JLabel times = new JLabel(" x ");        
    num2 = new JTextField(6);
    JLabel eql = new JLabel(" = ");        
    calc = new JLabel("Uknown");        
    JButton ans = new JButton("Calculate");
    ans.addActionListener (this);
    ans.setActionCommand ("what");
    
    add(num1);
    add(times);
    add(num2);
    add(eql);
    add(calc);
    add(ans);
  } //end constructor
  
  public void actionPerformed (ActionEvent e) {
    if(e.getActionCommand().equals("what")) {
      int n1,n2;
      try {
        n1 = Integer.parseInt (num1.getText ());
      } catch (NumberFormatException nfe) {
        n1 = 0;
      }
      try {
        n2 = Integer.parseInt (num2.getText ());
      } catch (NumberFormatException nfe) {
        n2 = 0;
      }
      calc.setText(String.valueOf(n1*n2));
    }
  }//end actionPerformed    
} // end class
