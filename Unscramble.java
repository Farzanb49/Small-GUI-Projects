
/**
 * Write a description of class Unscramble here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Unscramble extends JPanel implements ActionListener 
{
    JTextField guess; 
    JLabel good;
     JButton done; 
    public static void main (String args[])
    {
        JFrame frame = new JFrame ("unscramble");
        Unscramble content = new Unscramble ();
        frame.setSize(450, 300);
        frame.setContentPane(content);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }
    public Unscramble (){
        JLabel unscramble = new JLabel ("Unscramble");
        unscramble.setFont (new Font("Jokerman", Font.BOLD, 27));
        JLabel enter = new JLabel ("Enter the unscrambled word. Press done to check.");
        enter.setFont (new Font ("Arial", Font.BOLD, 12));
        JLabel word = new JLabel ("rpgmaornimg si oolc");
        word.setFont (new Font("Arial", Font.BOLD, 22));
        guess = new JTextField (10);
        JButton done = new JButton("Done");
        good = new JLabel ("");
  
        done.setActionCommand ("go");
        done.addActionListener(this);
        
        add (unscramble);
        add (enter);
        add (word);
        add (guess);
        add (done);
        add(good);
      
       
    }
    public void actionPerformed (ActionEvent e){
                if (e.getActionCommand().equals("go"))
        {
            String guessa = guess.getText();
            if (guessa.equals("programming is cool"))
            {
                good.setText("I agree! It is cool!");
            }
            else {
            good.setText ("Try again!");
            }
        }
    }
}