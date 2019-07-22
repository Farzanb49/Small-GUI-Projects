
/**
 * Write a description of class SomethingSomething here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SomethingSomething extends JPanel implements ActionListener
{
    JButton the;
    JButton beautiful;
    JButton dragon;
    JButton crawled;
    JButton from;
    JButton the2;
    JButton crooked;
    JButton trunk;
    public static void main (String args []){
        SomethingSomething content = new SomethingSomething();

        JFrame frame = new JFrame("SomethingSomething");
        frame.setContentPane(content);
        frame.setSize(300,425);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public SomethingSomething (){
        JLabel title = new JLabel ("The Something Something");
        title.setFont (new Font ("Arial", Font.BOLD, 24));
        JLabel title2 = new JLabel ("Press the buttons to randomize a sentence.");
        the = new JButton ("The");
        the.setPreferredSize (new Dimension (250, 38));
        the.setBackground (new Color (255,0,0));
        the.setForeground (Color.orange);
        the.setActionCommand ("go");
        the.addActionListener(this);
        beautiful = new JButton ("Beautiful");
        beautiful.setPreferredSize (new Dimension (250, 38));
        beautiful.setBackground (new Color (255,0,0));
        beautiful.setForeground (Color.orange);
        beautiful.setActionCommand ("go2");
        beautiful.addActionListener(this);
        dragon = new JButton ("Dragon");
        dragon.setPreferredSize (new Dimension (250, 38));
        dragon.setBackground (new Color (255,0,0));
        dragon.setForeground (Color.orange);
        dragon.setActionCommand ("go3");
        dragon.addActionListener(this);
        crawled = new JButton ("Crawled");
        crawled.setPreferredSize (new Dimension (250, 38));
        crawled.setBackground (new Color (255,0,0));
        crawled.setForeground (Color.orange);
        crawled.setActionCommand ("go4");
        crawled.addActionListener(this);
        from = new JButton ("From");
        from.setPreferredSize (new Dimension (250, 38));
        from.setBackground (new Color (255,0,0));
        from.setForeground (Color.orange);
        from.setActionCommand ("go5");
        from.addActionListener(this);
        the2 = new JButton ("The");
        the2.setPreferredSize (new Dimension (250, 38));
        the2.setBackground (new Color (255,0,0));
        the2.setForeground (Color.orange);
        the2.setActionCommand ("go6");
        the2.addActionListener(this);
        crooked = new JButton ("Crooked");
        crooked.setPreferredSize (new Dimension (250, 38));
        crooked.setBackground (new Color (255,0,0));
        crooked.setForeground (Color.orange);
        crooked.setActionCommand ("go7");
        crooked.addActionListener(this);
        trunk = new JButton ("Trunk");
        trunk.setPreferredSize (new Dimension (250, 38));
        trunk.setBackground (new Color (255,0,0));
        trunk.setForeground (Color.orange);
        trunk.setActionCommand ("go8");
        trunk.addActionListener(this);

        add (the);
        add (beautiful);
        add (dragon);
        add (crawled);
        add (from);
        add (the2);
        add (crooked);
        add (trunk);

    }

    public void actionPerformed (ActionEvent e){
        if (e.getActionCommand ().equals ("go"))
        {
            int r = (int)(Math.random () * 3);
            if (r == 0)
                the.setText ("The");
            else if (r==1)
                the.setText ("A");
            else
                the.setText ("This");
        }
                if (e.getActionCommand ().equals ("go2"))
        {
            int r = (int)(Math.random () * 3);
            if (r == 0)
                beautiful.setText ("Tall");
            else if (r==1)
                beautiful.setText ("Green");
            else
                beautiful.setText ("Silent");
        }
                if (e.getActionCommand ().equals ("go3"))
        {
            int r = (int)(Math.random () * 3);
            if (r == 0)
                dragon.setText ("Boy");
            else if (r==1)
                dragon.setText ("Wheat");
            else
                dragon.setText ("Policy");
        }
                if (e.getActionCommand ().equals ("go4"))
        {
            int r = (int)(Math.random () * 3);
            if (r == 0)
                crawled.setText ("Arrived");
            else if (r==1)
                crawled.setText ("Slithered");
            else
                crawled.setText ("Bounced");
        }        if (e.getActionCommand ().equals ("go5"))
        {
            int r = (int)(Math.random () * 3);
            if (r == 0)
                from.setText ("By");
            else if (r==1)
                from.setText ("To");
            else
                from.setText ("Near");
        }
                if (e.getActionCommand ().equals ("go6"))
        {
            int r = (int)(Math.random () * 3);
            if (r == 0)
                the2.setText ("A");
            else if (r==1)
                the2.setText ("The");
            else
                the2.setText ("This");
        }
                if (e.getActionCommand ().equals ("go7"))
        {
            int r = (int)(Math.random () * 3);
            if (r == 0)
                crooked.setText ("Stunning");
            else if (r==1)
                crooked.setText ("Dreadful");
            else
                crooked.setText ("Dingy");
        }
                if (e.getActionCommand ().equals ("go8"))
        {
            int r = (int)(Math.random () * 3);
            if (r == 0)
                trunk.setText ("Cave");
            else if (r==1)
                trunk.setText ("Rock");
            else
                trunk.setText ("Skyscraper");
        }
    }
}
