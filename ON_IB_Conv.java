/**
 * Write a description of class ON_IB_Conv here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ON_IB_Conv extends JPanel implements ActionListener
{
    public static void main (String args[])
    {
        JFrame frame = new JFrame("ON-IB Convert");
        ON_IB_Conv content = new ON_IB_Conv();

        frame.setSize(550,250);
        frame.setLocationRelativeTo(null);
        frame.setContentPane( content);
        frame.setVisible(true);
    }

    JTextField on;
    JTextField ib;
    JLabel onib;
    JLabel ibon;
    public ON_IB_Conv()
    {
        JPanel panelA = new JPanel();
        panelA.setLayout(new GridLayout(1,3));
        JPanel panelB = new JPanel();
        panelB.setLayout(new GridLayout(1,3));

        //Declaration
        JLabel title = new JLabel("     Ontario-IB Conversion     ");
        JLabel onTitle = new JLabel("Ontario % to IB Mark");
        on = new JTextField(10);
        onib = new JLabel("%            -> ");
        JLabel ibTitle = new JLabel("IB Mark to Ontario %");
        ib = new JTextField(10);
        JLabel ibon = new JLabel("               -> ");
        JButton convOn = new JButton("CONVERT");
        JButton convIb = new JButton("CONVERT");

        //Mutation
        title.setFont(new Font("Cambria",Font.ITALIC,37));
        on.setFont(new Font("Arial",Font.PLAIN,20));
        ib.setFont(new Font("Arial",Font.PLAIN,20));
        onib.setFont(new Font("Cambria",Font.PLAIN,20));
        ibon.setFont(new Font("Cambria",Font.PLAIN,20));
        convOn.setFont(new Font("Arial",Font.PLAIN,20));
        convIb.setFont(new Font("Arial",Font.PLAIN,20));

        //Action
        convOn.setActionCommand("convOn");
        convOn.addActionListener(this);
        convIb.setActionCommand("convIb");
        convIb.addActionListener(this);

        //Addition
        add(title);

        add(onTitle);
        add(panelA);
        panelA.add(on);
        panelA.add(onib);
        panelA.add(convOn);

        add(ibTitle);
        add(panelB);
        panelB.add(ib);
        panelB.add(ibon);
        panelB.add(convIb);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("convOn"))
        {
            int ont = Integer.parseInt(on.getText());
            if (ont==100)
                onib.setText("% -> 8  @_@");
            else if (ont==99)
                onib.setText("% -> 7+");
            else if (ont==98)
                onib.setText("% -> 7");
            else if (ont==97)
                onib.setText("% -> 7-");
            else if (ont==96)
                onib.setText("% -> 6+");
            else if (ont==94)
                onib.setText("% -> 6");
            else if (ont==93)
                onib.setText("% -> 6-");
            else if (ont==92)
                onib.setText("% -> 5+");
            else if (ont>=88)
                onib.setText("% -> 5");
            else if (ont>=84)
                onib.setText("% -> 5-");
            else if (ont==83)
                onib.setText("% -> 4+");    
            else if (ont>=78)
                onib.setText("% -> 4");
            else if (ont>=72)
                onib.setText("% -> 4-");
            else if (ont==71)
                onib.setText("% -> 3+");
            else if (ont>=66)
                onib.setText("% -> 3");
            else if (ont>=61)
                onib.setText("% -> 3-");
            else if (ont==60)
                onib.setText("% -> 2+");
            else if (ont>=55)
                onib.setText("% -> 2");
            else if (ont>=50)
                onib.setText("% -> 2-");
            else
                onib.setText("% -> ...Don't ask...");
        }
        else if(e.getActionCommand().equals("convIb"))
        {
            String ibo = ib.getText();

            if (ibo=="8")
                ibon.setText(" -> 100%");
            else if (ibo=="7+")
                ibon.setText("-> 99");
            else if (ibo=="7")
                ibon.setText("-> 98");
            else if (ibo=="7-")
                ibon.setText("-> 97");
            else if (ibo=="6+")
                ibon.setText("-> 96");
            else if (ibo=="6")
                ibon.setText("-> 94");
            else if (ibo=="6-")
                ibon.setText("-> 93");
            else if (ibo=="5+")
                ibon.setText("-> 92");
            else if (ibo=="5")
                ibon.setText("-> 88");
            else if (ibo=="5-")
                ibon.setText(" -> 84");
            else if (ibo=="83")
                ibon.setText("-> 83");    
            else if (ibo=="78")
                ibon.setText("-> 78");
            else if (ibo=="4-")
                ibon.setText("-> 72");
            else if (ibo=="3+")
                ibon.setText("-> 71");
            else if (ibo=="3")
                ibon.setText("-> 66");
            else if (ibo=="3-")
                ibon.setText("-> 61");
            else if (ibo=="2+")
                ibon.setText("-> 60");
            else if (ibo=="2")
                ibon.setText("-> 55");
            else if (ibo=="2-")
                ibon.setText("-> 50");
            else
                ibon.setText("-> ...Don't ask...");
        }
    }
}
