import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddingDialog extends JPanel implements ActionListener{
  //Global Variables
  JLabel score;
  int points = 0;
  
    public static void main (String[] args){
        AddingDialog content = new AddingDialog();

        JFrame window = new JFrame("Keeping Score");
        window.setContentPane( content);
        window.setSize(300,120);
        window.setLocation( 100, 100);
        window.setVisible(true);
    }//end main
    
    public AddingDialog(){
      JLabel instruction = new JLabel ("Adding Game");
      instruction.setFont (new Font ("Arial", Font.BOLD, 18));
      instruction.setForeground (Color.blue);
      
      JLabel question = new JLabel ("Press new question to get a question. ");
      score = new JLabel ("Score: 000");
      JButton newQuestion = new JButton ("Get a new question");
      newQuestion.setActionCommand( "new_add");
      newQuestion.addActionListener (this);
      
      add (instruction);
      add (question);
      add (newQuestion);
      add (score);
    }//end constructor
    
    public void actionPerformed (ActionEvent e){
      if (e.getActionCommand().equals ("new_add")) {
        int num1 = ((int) (Math.random() * 5)) + 1;
        int num2 = ((int) (Math.random() * 5)) + 1;
        String quest = "Answer this quesiton: " + num1 + " + " + num2 + " = ";
        String input = JOptionPane.showInputDialog (quest);
        int ans = Integer.parseInt (input);
        if (ans == (num1 + num2)) {
          /*
           * JOptionPane.showMessageDialog(
           *       1. Optional frame to attach to
           *       2. message to display
           *       3. title bar message
           *       4. type of dialogue box
           */
          JOptionPane.showMessageDialog (null, 
                                         (num1 + num2) + " is correct! You got it right!",
                                         "CORRECT!", 
                                         JOptionPane.INFORMATION_MESSAGE);
          points++;
        } else {
          JOptionPane.showMessageDialog (null, (num1 + num2) + " is the correct answer, not " + input,
                                         "WRONG", JOptionPane.ERROR_MESSAGE);
        }
        score.setText ("Score: " + points);
      }
    }//end actionPerformed
    
}//end class