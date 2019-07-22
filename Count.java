
/**
 * Write a description of class Count here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Count extends JPanel implements ActionListener
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame("Count Keeper");
        Count content = new Count();
        frame.setContentPane(content);
        frame.setSize(200,300);
        frame.setLocation(200,100);
        frame.setVisible(true);
    }

    int count = 0;
    JLabel num;
    public Count()
    {
        //Declaration
        JLabel title = new JLabel("                 Count Me In                 ");
        num = new JLabel("                   "+count+"                   ");
        JButton add = new JButton("   +   ");
        JButton sub = new JButton("   -   ");
        JLabel inst = new JLabel("     We'll keep count for you ;)");

        //Mutation
        title.setFont(new Font("Times New Roman",Font.ITALIC,30));
        num.setFont(new Font("Courier",Font.BOLD,75));
        add.setSize(100,100);
        sub.setSize(100,100);

        //Action
        add.setActionCommand("+");
        add.addActionListener(this);
        sub.setActionCommand("-");
        sub.addActionListener(this);

        //Addition
        add(title);
        add(num);
        add(add);
        add(sub);
        add(inst);
    }

    public void actionPerformed (ActionEvent e)
    {
        if(e.getActionCommand().equals("+"))
        {
            count++;
            num.setText("                   "+count+"                   ");
        }
        else
        {
            count--;
            num.setText("                   "+count+"                   ");
        }
    }
}
