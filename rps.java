
/**
 * Write a description of class rps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class rps extends JPanel implements ActionListener
{
    JRadioButton rock;
    JRadioButton paper;
    JRadioButton scissors;
    JButton Play;
    JButton Reset;
    JLabel win;
    JLabel score;
    JLabel rpic;
    JLabel spic;
    JLabel ppic;
    int playScore = 0;
    int cpuScore = 0;
    public static void main (String args [])
    {
        rps content = new rps ();

        JFrame frame = new JFrame ("rockpaperscissors");
        frame.setContentPane( content);
        frame.setSize(750,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public rps (){
        JLabel title = new JLabel ("Rock, Paper Scissors");
        JLabel Subt = new JLabel ("Pick one: ");
        rock = new JRadioButton ("rock");
        paper = new JRadioButton ("paper");    
        scissors = new JRadioButton ("scissors");
        JLabel choice = new JLabel ("Your choice: ");
        rpic = new JLabel (createImageIcon (""));
        ppic = new JLabel (createImageIcon (""));
        spic = new JLabel (createImageIcon (""));
        JLabel cchoice = new JLabel ("Computer's choice: ");
        rpic = new JLabel (createImageIcon (""));
        ppic = new JLabel (createImageIcon (""));
        spic = new JLabel (createImageIcon (""));
        JPanel cmd = new JPanel();        
        Play = new JButton ("Play");
        Play.setActionCommand("go");
        Play.addActionListener(this);
        Reset = new JButton ("Reset Scores");
        Reset.setActionCommand("over");
        Reset.addActionListener(this);
        win = new JLabel ("");
        score = new JLabel ("");
        
        add (title);
        add (Subt);
        add (rock);
        add (paper);
        add (scissors);
        add (choice);
        add(rpic);
        add(ppic);
        add(spic);
        add (cchoice);
        add(rpic);
        add(ppic);
        add(spic);
add(cmd);
        cmd.add(Play);
        cmd.add(Reset);
        cmd.add(win);
        cmd.add(score);
        cmd.setBackground(Color.yellow);
    }

    public void actionPerformed (ActionEvent e){
        if (e.getActionCommand().equals("go")){
            int cpuGo = (int)(Math.random()*3+1);
            int playGo;

            if(rock.isSelected())
            {
                rpic.setIcon(createImageIcon ("download (7).jpe"));
                playGo = 1;
            }
            else if(paper.isSelected())
            {
                rpic.setIcon(createImageIcon ("download (8).jpe"));
                playGo = 2;
            }
            else
            {
                rpic.setIcon(createImageIcon ("download (9).jpe"));
                playGo = 3;
            }
            if(cpuGo==1)
            {
                ppic.setIcon(createImageIcon ("download (7).jpe"));
            }
            else if(cpuGo==2)
            {
                ppic.setIcon(createImageIcon ("download (8).jpe"));
            }
            else
            {
                ppic.setIcon(createImageIcon ("download (9).jpe"));
            }
            if(cpuGo==1&&playGo==1||cpuGo==2&&playGo==2||cpuGo==3&&playGo==3)
            {
                win.setText("DRAW - no points awarded");
            }
            else if(cpuGo==1)
            {
                if(playGo==2)
                {
                    win.setText("YOU WIN - 1 point awarded to you");
                    playScore++;
                }
                else
                {
                    win.setText("CPU WINS - 1 point awarded to the computer");
                    cpuScore++;
                }
            }
            else if(cpuGo==2)
            {
                if(playGo==3)
                {
                    win.setText("YOU WIN - 1 point awarded to you");
                    playScore++;
                }
                else
                {
                    win.setText("CPU WINS - 1 point awarded to the computer");
                    cpuScore++;
                }
            }
            else
            {
                if(playGo==1)
                {
                    win.setText("YOU WIN - 1 point awarded to you");
                    playScore++;
                }
                else
                {
                    win.setText("CPU WINS - 1 point awarded to the computer");
                    cpuScore++;
                }
            }
            score.setText("You- "+playScore+"      Computer- "+cpuScore);
        }
        else if (e.getActionCommand().equals("over")){
            playScore = 0;
            cpuScore = 0;
            score.setText ("You- "+playScore+"     Computer-"+cpuScore);
        }
    }

    protected static ImageIcon createImageIcon(String path)
    {
        java.net.URL imgURL = rps.class.getResource(path);
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
