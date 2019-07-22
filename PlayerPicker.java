import javax.swing.*; import java.awt.*; import java.awt.event.*;

public class PlayerPicker extends JPanel implements ActionListener {
  JLabel player;
  
  public static void main (String[] args){
    PlayerPicker content = new PlayerPicker();
    
    JFrame window = new JFrame("Player Picker");
    window.setContentPane( content);
    window.setSize(500,600);
    window.setLocation( 100, 100);
    window.setVisible(true);
  }//end main
  
  public PlayerPicker (){
    JLabel title = new JLabel ("Player Picker!");
    title.setFont (new Font ("Bertram LET", Font.PLAIN, 25));
    title.setForeground (Color.blue);
    JLabel t2 = new JLabel ("Click on the Player you want to see :)");
    t2.setFont (new Font ("Arial", Font.ITALIC, 14));
    
    JButton b1 = new JButton ("Mario");
    b1.setForeground (Color.white);
    b1.setBackground (Color.red);
    b1.setActionCommand ("Mario");
    b1.addActionListener (this);
    
    JButton b2 = new JButton ("Luigi");
    b2.setForeground (Color.white);
    b2.setBackground (Color.green);
    b2.setActionCommand ("Luigi");
    b2.addActionListener (this);
    
    JButton b3 = new JButton ("Peach");
    b3.setForeground (Color.white);
    b3.setBackground (Color.pink);
    b3.setActionCommand ("Peach");
    b3.addActionListener (this);
    
    JButton b4 = new JButton ("Daisy");
    b4.setForeground (Color.white);
    b4.setBackground (Color.orange);
    b4.setActionCommand ("Daisy");
    b4.addActionListener (this);
    
    JButton b5 = new JButton ("Rosalina");
    b5.setForeground (Color.white);
    b5.setBackground (new Color(51,204,255));
    //http://teaching.csse.uwa.edu.au/units/CITS1001/colorinfo.html
    b5.setActionCommand ("Rosalina");
    b5.addActionListener (this);

    player = new JLabel (createImageIcon ("marioprofile.png"));
    add (title);
    add (t2);
    add (b1); add (b2); add (b3); add (b4); add (b5);
    add (player);
  }//end constructor
  
  public void actionPerformed (ActionEvent e){
    if (e.getActionCommand().equals ("Mario")) {
      player.setIcon (createImageIcon ("marioprofile.png"));
    } else if (e.getActionCommand().equals("Luigi")) {
      player.setIcon (createImageIcon ("luigiprofile.png"));
    } else if (e.getActionCommand().equals("Peach")) {
      player.setIcon (createImageIcon ("peachprofile.png"));
    } else if (e.getActionCommand().equals("Daisy")) {
      player.setIcon (createImageIcon ("daisyprofile.png"));
    } else if (e.getActionCommand().equals ("Rosalina")) {
      player.setIcon (createImageIcon ("rosalinaprofile.png"));
    }
  }//end actionPerformed
  
  protected static ImageIcon createImageIcon (String path) {
    java.net.URL imgURL = PlayerPicker.class.getResource (path);
    if (imgURL != null) {
      return new ImageIcon (imgURL);
    } else {
      System.err.println ("Couldn't find file: " + path);
      return null;
    }
  }//end createImageIcon
}//end class
//pictures obtained from http://mariopartylegacy.com/characters