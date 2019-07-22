
/**
 * Write a description of class findme here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class findme extends JPanel implements ActionListener 
{
    JLabel title;
    JLabel hall;
    JLabel study;
    JLabel lounge;
    JLabel conservatory;
    JLabel library;
    JLabel ballroom;
    JLabel billiard;
    JLabel find;
    JButton hall1;
    JButton study1;
    JButton lounge1;
    JButton conservatory1;
    JButton library1;
    JButton ballroom1;
    JButton billiard1;
    public static void main (String args []){
        findme content = new findme ();

        JFrame frame = new JFrame("Find Me");
        frame.setContentPane( content);
        frame.setSize(200,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public findme (){
        title = new JLabel ("You are in the hall");
        hall = new JLabel (createImageIcon("download.jpe"));
        find = new JLabel ("You did not find me!");
        JLabel go = new JLabel ("Go to:");
        study1 = new JButton ("Study");
        study1.setActionCommand("a");
        study1.addActionListener(this);
        lounge1 = new JButton ("Lounge");
        lounge1.setActionCommand("b");
        lounge1.addActionListener(this);
        conservatory1 = new JButton ("Conservatory");
        conservatory1.setActionCommand("c");
        conservatory1.addActionListener(this);
        add (title);
        add (hall);
        add (find);
        add (go);
        add (study1);
        add (lounge1);
        add (conservatory1);

    }

    public void actionPerformed (ActionEvent e){
         if (e.getActionCommand().equals("a")){
            title = new JLabel ("You are in the study");
            study = new JLabel (createImageIcon("download(1).jpe"));

    }
}

    protected static ImageIcon createImageIcon (String path)
    {
        java.net.URL imgURL = findme.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon (imgURL);
        }
        else
        {
            System.err.println("Couldn't find file: "+path);
            return null;
        }
    }
}
