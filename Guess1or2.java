import javax.swing.*; import java.awt.*; import java.awt.event.*;

public class Guess1or2 extends JPanel implements ActionListener{
  //Global Variables
  JTextField guess;
  
  //add here
  JLabel score;
  int points = 0;
  
  public static void main (String[] args){
    Guess1or2 content = new Guess1or2();
    
    JFrame window = new JFrame("Guess");
    window.setContentPane( content);
    window.setSize(300,120);
    window.setLocation( 100, 100);
    window.setVisible(true);
  }//end main
  
  public Guess1or2(){
    guess = new JTextField(3);
    JLabel question = new JLabel ("Guess the number. It is 1 or 2.");
    
    JButton newQuestion = new JButton ("Get a new question");
    newQuestion.setActionCommand ("new_add");
    newQuestion.addActionListener (this);
    
    //add here
    score = new JLabel ("Score: 000");
    
    add (question);
    add (guess);
    add (newQuestion);
    
    //add here
    add (score);
  }//end constructor
  public void actionPerformed (ActionEvent e) {
    if (e.getActionCommand().equals("new_add")) {
      int num = ((int)(Math.random()*2)) + 1;
      String input = guess.getText();
      int ans = Integer.parseInt (input);
      if (ans == (num)) {
        JOptionPane.showMessageDialog(null,"Right! It was " + num);

        //add here
        points++;
      } else {
        JOptionPane.showMessageDialog(null,"Wrong! It was " + num);
      }
      score.setText("Score: " + points);
    }
  } // end actionPerformed
}// end class
  
  
  