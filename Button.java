
/**
 * Write a description of class redbutton here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Button extends JPanel implements ActionListener
{
    static JFrame frame = new JFrame("DO NOT");
    public static void main (String args[])
    {
        Button content = new Button();

        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setContentPane(content);
    }

    JLabel tell;
    public Button()
    {
        //Declaration
        JButton press = new JButton("");
        JLabel space = new JLabel("                                                                     ");
        tell = new JLabel("Do not press the red button.");

        //Mutation
        press.setBackground(Color.red);
        press.setPreferredSize(new Dimension(50, 50));

        //Actions
        press.setActionCommand("press");
        press.addActionListener(this);

        //Addition
        add(press);
        add(space);
        add(tell);
    }

    int count = 1;
    public void actionPerformed (ActionEvent e)
    {
        if (e.getActionCommand().equals("press"))
        {
            switch (count)
            {
                case 1: 
                tell.setText("*Ahem*... Do NOT press the red button.");
                break;
                case 2: 
                tell.setText("Don't do it.");
                break;
                case 3: 
                tell.setText("Seriously.");
                break;
                case 4: 
                tell.setText("Not this again.");
                break;
                case 5: 
                tell.setText("...you pressed it again. Again.");
                break;
                case 6: 
                tell.setText("...this displeases me >_>");
                break;
                case 7: 
                tell.setText("Quick! What's that behind you?");
                break;
                case 8: 
                tell.setText("Fine then. Press it again. See if I care.");
                break;
                case 9: 
                tell.setText("Again.");
                break;
                case 10: 
                tell.setText("Do it again.");
                break;
                case 11: 
                tell.setText("Click it!");
                break;
                case 12: 
                tell.setText("And again.");
                break;
                case 13: 
                tell.setText("OK, that's enough. You've got your fill.");
                break;
                case 14: 
                tell.setText("I mean it. It's time to stop pressing it.");
                break;
                case 15: 
                tell.setText("You see, this is why we can't be friends.");
                break;
                case 16: 
                tell.setText("You are just too selfish.");
                break;
                case 17: 
                tell.setText("Now you're asking for it. DoN0t pRe5S iT 4gAin!");
                break;
                case 18: 
                tell.setText("You are immune to my mind control.");
                break;
                case 19: 
                tell.setText("*Time for plan B.* PRESS IT. You know you want to.");
                break;
                case 20: 
                tell.setText("See that! Reverse psychology! But it didn't work :<");
                break;
                case 21: 
                tell.setText("Really? Aren't you getting bored yet?");
                break;
                case 22: 
                tell.setText("Don't you have anything else to do?");
                break;
                case 23: 
                tell.setText("Fine then. Goodbye.");
                break;
                case 24: 
                frame.dispose();
                break;
            }
            count++;
        }
    }
}
