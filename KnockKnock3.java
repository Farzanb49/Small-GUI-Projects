import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KnockKnock3 extends JPanel implements ActionListener {
  //Global Variables
  CardLayout cdLayout = new CardLayout ();
  
  public static void main (String[] args){
    KnockKnock3 content = new KnockKnock3();
    
    JFrame window = new JFrame("Knock Knock");
    window.setContentPane( content);
    window.setSize(300,100);
    window.setLocation( 100, 100);
    window.setVisible(true);
    //cookit: default layout manager for a JFrame's content pane 
    //         is already a BorderLayout() so the lines below do nothing
    //window.setLayout (new BorderLayout ());
    //window.add (content, "Center");
  }//end main
  public KnockKnock3(){
    setLayout (cdLayout);
    screen1();
    screen2();
    screen3();
    screen4();
    screen5();
    //setLayout (new BorderLayout ());
    //        add ("Center", this);
    
  }//end constructor
  public void screen1 () {
    JPanel card1 = new JPanel();
    card1.setBackground (Color.white);
    JLabel title = new JLabel ("Knock, knock...");
    JButton next = new JButton ("Next");
    next.setActionCommand ("2");
    next.addActionListener (this);
    card1.add (title);
    card1.add (next);
    add ("1", card1);
  }//end screen1
  public void screen2 () {
    JPanel card2 = new JPanel();
    card2.setBackground (Color.orange);
    JLabel title = new JLabel ("Who's there?");
    JButton next = new JButton ("Next");
    next.setActionCommand ("3");
    next.addActionListener (this);
    card2.add (title);
    card2.add (next);
    add ("2", card2);
  }//end screen2    
  public void screen3 () {
    JPanel card3 = new JPanel();
    card3.setBackground (Color.green);
    JLabel title = new JLabel ("Icon.");
    JButton next = new JButton ("Next");
    next.setActionCommand ("4");
    next.addActionListener (this);
    card3.add (title);
    card3.add (next);
    add ("3", card3);
  }//end screen3
  public void screen4 () {
    JPanel card4 = new JPanel();
    card4.setBackground (Color.yellow);
    JLabel title = new JLabel ("Icon Who?");
    JButton next = new JButton ("Next");
    next.setActionCommand ("5");
    next.addActionListener (this);
    card4.add (title);
    card4.add (next);
    add ("4", card4);
  }//end screen4
  public void screen5 () {
    JPanel card5 = new JPanel();
    card5.setBackground (Color.cyan);
    JLabel title = new JLabel ("Icon tell you another");
    JLabel title2 = new JLabel ("knock knock joke.");
    JLabel title3 = new JLabel ("Do you want me to?");
    JButton next = new JButton ("Yes");
    next.setActionCommand ("1");
    next.addActionListener (this);
    card5.add (title);
    card5.add (title2);
    card5.add (title3);
    card5.add (next);
    //add ( card5);
    add ("5", card5);
  }//end screen5
  public void actionPerformed (ActionEvent e){
    //moves between the screens 
     if (e.getActionCommand().equals ("1")) {
     cdLayout.show (this, "1");
     } else if (e.getActionCommand().equals ("2")) {
     cdLayout.show (this, "2");
     } else if (e.getActionCommand().equals ("3")) {
     cdLayout.show (this, "3");
     } else if (e.getActionCommand().equals ("4")) {
     cdLayout.show (this, "4");
     } else if (e.getActionCommand().equals ("5")) {
     cdLayout.show (this, "5");
     }
     
     //below can accomplish the same as above by navigating
     //   between panels in the order they were add()ed.
     //cdLayout.next(this);
  }//end actionPerformed
  
}//end class