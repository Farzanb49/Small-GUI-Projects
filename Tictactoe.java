
/**
 * Write a description of class Tictactoe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Tictactoe extends JPanel implements ActionListener {
    JButton i;
    JButton ii;
    JButton iii;
    JButton iv;
    JButton v;
    JButton vi;
    JButton vii;
    JButton viii;
    JButton nine;
    JLabel victor;  
   
    public static void main (String args []){
        
        Tictactoe content = new Tictactoe();
        
        JFrame frame = new JFrame("TicTacOX");
        frame.setSize(180,190);
        frame.setContentPane(content);
        frame.setLocation(200,200);
        frame.setVisible(true);
    }

    public Tictactoe (){
        JLabel title = new JLabel ("Tic-Tac-Toe!");
        title.setFont(new Font ("Arial", Font.BOLD, 20));
        i = new JButton ("1");
        ii = new JButton ("2");
        iii = new JButton ("3");
        iv = new JButton ("4");
        v = new JButton ("5");
        vi = new JButton ("6");
        vii = new JButton ("7");
        viii = new JButton ("8");
        nine = new JButton ("9");
        victor = new JLabel("");
        i.setActionCommand("1");
        ii.setActionCommand("2");
        iii.setActionCommand("3");
        iv.setActionCommand("4");
        v.setActionCommand("5");
        vi.setActionCommand("6");
        vii.setActionCommand("7");
        viii.setActionCommand("8");
        nine.setActionCommand("9");
        i.addActionListener(this);
        ii.addActionListener(this);
        iii.addActionListener(this);
        iv.addActionListener(this);
        v.addActionListener(this);
        vi.addActionListener(this);
        vii.addActionListener(this);
        viii.addActionListener(this);
        nine.addActionListener(this);
        add (title);
        add (i);
        add (ii);
        add (iii);
        add (iv);
        add (v);
        add (vi);
        add (vii);
        add (viii);
        add (nine);
        add (victor);
    }
    int turn = 1;
    String xoro;

    public void actionPerformed (ActionEvent e){
        if (turn%2==1)
            xoro = "X";
        else
            xoro = "O";
        turn++;
        if (e.getActionCommand().equals("1")){
            i.setEnabled(false);
            i.setText(xoro);}
        else if (e.getActionCommand().equals("2")){
            ii.setEnabled(false);
            ii.setText(xoro);}
        else if (e.getActionCommand().equals("3")){
            iii.setEnabled(false);
            iii.setText(xoro);}
        else if (e.getActionCommand().equals("4")){
            iv.setEnabled(false);
            iv.setText(xoro);}
        else if (e.getActionCommand().equals("5")){
            v.setEnabled(false);
            v.setText(xoro);}
        else if (e.getActionCommand().equals("6")){
            vi.setEnabled(false);
            vi.setText(xoro);}
        else if (e.getActionCommand().equals("7")){
            vii.setEnabled(false);
            vii.setText(xoro);}
        else if (e.getActionCommand().equals("8")){
            viii.setEnabled(false);
            viii.setText(xoro);}
        else if (e.getActionCommand().equals("9")){
            nine.setEnabled(false);
            nine.setText(xoro);}
        String aone = i.getText();
        String atwo = ii.getText();
        String athree = iii.getText();
        String afour = iv.getText();
        String afive = v.getText();
        String asix = vi.getText();
        String aseven = vii.getText();
        String aeight = viii.getText();
        String anine = nine.getText();
        eval(aone,atwo,athree,afour,afive,asix,aseven,aeight,anine);
    }

    public void eval(String one,String two,String three,String four,String five,String six,String seven,String eight,String nine)
    {
if (one.equals("X")&&two.equals("X")&&three.equals("X")||four.equals("X")&&five.equals("X")&&six.equals("X")||seven.equals("X")&&eight.equals("X")&&nine.equals("X")||one.equals("X")&&five.equals("X")&&nine.equals("X")||three.equals("X")&&five.equals("X")&&seven.equals("X")||one.equals("X")&&four.equals("X")&&seven.equals("X")||two.equals("X")&&five.equals("X")&&eight.equals("X")||three.equals("X")&&six.equals("X")&&nine.equals("X"))
            victor.setText("X is VICTORIOUS!");
        else if (one.equals("O")&&two.equals("O")&&three.equals("O")||four.equals("O")&&five.equals("O")&&six.equals("O")||seven.equals("O")&&eight.equals("O")&&nine.equals("O")||one.equals("O")&&five.equals("O")&&nine.equals("O")||three.equals("O")&&five.equals("O")&&seven.equals("O")||one.equals("O")&&four.equals("O")&&seven.equals("O")||two.equals("O")&&five.equals("O")&&eight.equals("O")||three.equals("O")&&six.equals("O")&&nine.equals("O"))
            victor.setText("O is VICTORIOUS!");
    }
}

