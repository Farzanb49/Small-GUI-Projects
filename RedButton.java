import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.event.*;

public class RedButton extends JPanel implements ActionListener {
  // Place instance variables here
  JLabel message;
  int butnum = 0;
  
  public static void main (String[] args){
    RedButton content = new RedButton();
    
    JFrame window = new JFrame("My Window Title");
    window.setContentPane( content);
    window.setSize(420,420);
    window.setLocation( 100, 100);
    window.setVisible(true);  
  }//end main
  
  public RedButton (){
    JButton redbutton = new JButton ();
    try {
      Image img = ImageIO.read (getClass ().getResource ("RedButton.jpg"));
      redbutton.setIcon (new ImageIcon (img));
    } catch (Exception ex) {
      System.out.println (ex);
    }
    
    message = new JLabel ("Do not press the red button");
    redbutton.addActionListener (this);
    redbutton.setActionCommand ("press");
    
    add (redbutton);
    add (message);
  } // end Constructor method
  
  
  public void actionPerformed (ActionEvent e) {
    if (e.getActionCommand ().equals ("press")) {
      butnum = (butnum + 1) % 23;
      
      switch (butnum) {
        case 0:
          message.setText ("Do not press the red button");
          break;
        case 1:
          message.setText ("* Ahem * Do NOT press the red button.");
          break;
        case 2:
          message.setText ("Don 't do it.");
          break;
        case 3:
          message.setText ("Seriously.");
          break;
        case 4:
          message.setText ("Not this again.");
          break;
        case 5:
          message.setText (". . .you pressed it again.Do NOT press the button.");
          break;
        case 6:
          message.setText (". . . .this displeases me.");
          break;
        case 7:
          message.setText ("Quick !What 's that behind you.");
          break;
        case 8:
          message.setText (" All right, press it again.See if I care.");
          break;
        case 9:
          message.setText ("Again.");
          break;
        case 10:
          message.setText ("Do it again.");
          break;
        case 11:
          message.setText ("Click it !");
          break;
        case 12:
          message.setText ("And again.");
          break;
        case 13:
          message.setText ("OK, that 's enough. You' ve got your fill.");
          break;
        case 14:
          message.setText ("I mean it.It 's time to stop pressing it.");
          break;
        case 15:
          message.setText ("You see, this is why we can 't be friends.");
          break;
        case 16:
          message.setText ("You are just too selfish.");
          break;
        case 17:
          message.setText ("Now you 've asked for it. DoNoT pReSs It AgAiN!");
          break;
        case 18:
          message.setText ("You seem immune to my mind control.");
          break;
        case 19:
          message.setText ("Time for plan B.Press it.You know you want to.");
          break;
        case 20:
          message.setText ("See that was reverse psychology !Oh wait, it didn 't work.");
          break;
        case 21:
          message.setText ("Really ? aren 't you getting bored yet?");
          break;
        case 22:
          message.setText ("Don 't you have anything else to do?");
          break;
      } //end switch()
    } //end if()
  } // end actionPerformed 
} //end class