
/**
 * Write a description of class knitting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class knitting extends JPanel implements ActionListener
{
    JTextField aa;
    JTextField bb; 
    JTextField cc; 
    JTextField dd;
    JLabel end;
    JButton done;
    public static void main (String args []){
        knitting content = new knitting ();
        JFrame frame = new JFrame ("knitting");
        frame.setContentPane( content);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public knitting (){
        JLabel title = new JLabel ("Knitting");
        title.setFont (new Font("Arial", Font.BOLD, 24));
        JLabel picture = new JLabel (createImageIcon ("Knitting.jpg"));
        JLabel a = new JLabel ("A");
         aa = new JTextField (3);
        JLabel b = new JLabel ("B");
        bb= new JTextField (3);
        JLabel c = new JLabel ("C");
        cc= new JTextField (3);
        JLabel d = new JLabel ("D");
        dd = new JTextField (3);
        done = new JButton ("Done");
        end = new JLabel ("");
        done.setActionCommand("done");
        done.addActionListener(this);
        
        
        add (title);
        add (picture);
        add (a);
        add (aa);
        add (b);
        add (bb);
        add (c);
        add (cc);
        add (d);
        add (dd);
        add (done);
        add (end);
    }
    public void actionPerformed (ActionEvent e){
        if(e.getActionCommand().equals("done"))
        {
            String test = aa.getText();
            String test2 = bb.getText();
            String test3 = cc.getText();
            String test4 = dd.getText();
            if (test.equals ("A")||test.equals("a")&&test2.equals ("B")||test2.equals("b")&&test3.equals("C")||test3.equals("c")&&test4.equals("D")||test4.equals("d")){
                end.setText("that's right");
            }
             else{
                 end.setText ("try again!");
    }
}
}
    protected static ImageIcon createImageIcon (String path){
        java.net.URL imgURL = knitting.class.getResource( path);
        if (imgURL != null){
            return new ImageIcon (imgURL);
        }
        else {
            System.err.println ("Couldn't find file: " + path);
            return null;
        }
}
}