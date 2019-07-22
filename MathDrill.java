import javax.swing.*; import java.awt.*; import java.awt.event.*;

public class MathDrill extends JPanel implements ActionListener {
  JLabel flashCard;
  
  public static void main (String[] args){
    MathDrill content = new MathDrill();
    
    JFrame window = new JFrame("Math Drill");
    window.setContentPane( content);
    window.setSize(400,200);
    window.setLocation( 100, 100);
    window.setVisible(true);
  }//end main
  
  public MathDrill (){
    flashCard = new JLabel ("24 / 6 = ?    ");
    flashCard.setFont (new Font ("Arial", Font.PLAIN, 60));
    JButton b1 = new JButton ("Addition Question");
    b1.setActionCommand("+");
    b1.addActionListener(this);
    JButton b2 = new JButton ("Division Question");
    b2.setActionCommand("div");
    b2.addActionListener(this);
    add (flashCard);
    add (b1); add (b2);
  }//end constructor
  
  public void actionPerformed (ActionEvent e){
    int n1 = (int) (Math.random() * 5 + 1);
    int n2 = (int) (Math.random() * 5 + 1);
    
    if (e.getActionCommand().equals("+")){
      flashCard.setText (n1 + " + " + n2 + " = ?    ");
    } else if (e.getActionCommand().equals("div")) {
      flashCard.setText (n1 + n2 + " / " + n2 + " = ?    ");
    }
  }//end actionPerformed
}//end class