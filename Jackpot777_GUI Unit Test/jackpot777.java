 

//Jackpot 777 game - Om Patel - May 3, 2019
//unit 4 gui programming test
//to Play, click the play button
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class jackpot777 extends JPanel implements ActionListener {
    //declaring the counters
    int games=0;
    int won=0;
    int money=0;
    //declaring image labels
    JLabel one;
    JLabel two;
    JLabel thr;
    //declaring counter labels
    JLabel thismn;
    JLabel gamespl;
    JLabel gamesmn;
    JLabel gameswn;
    public static void main (String[] args){
        jackpot777 content = new jackpot777();
        JFrame window = new JFrame("Jackpot777");
        window.setContentPane(content);
        window.setSize(1050,550);
        window.setLocation( 100, 100);
        window.setVisible(true);
    }//end main

    public jackpot777(){
        //making the title text
        JLabel title = new JLabel("Jackpot777");
        //mutators
        title.setFont(new Font("Cooper black",Font.BOLD,50));
        title.setForeground(Color.blue);

        //making one panel for all buttons
        JPanel buttons=new JPanel();

        JButton play=new JButton("Play");
        play.setActionCommand ("play");
        play.addActionListener (this); 
        buttons.add (play);//adding play button to the button panel

        JButton reset=new JButton("Reset Score");
        reset.setActionCommand ("reset");
        reset.addActionListener (this); 
        buttons.add(reset);//adding reset button to button panel

        //making panel for all 3 slot images
        JPanel pictures=new JPanel();

        //default image is set to 4 for all 3 slots
        one=new JLabel(createImageIcon("4.png"));
        two=new JLabel(createImageIcon("4.png"));
        thr=new JLabel(createImageIcon("4.png"));

        //adding pictures to the picture panel
        pictures.add(one);
        pictures.add(two);
        pictures.add(thr);

        //making panel for the stat counters
        JPanel counters=new JPanel();
        gamespl= new JLabel("Games played: 0");
        gameswn=new JLabel("Games won: 0");
        gamesmn=new JLabel("Total money earned: $0");
        thismn=new JLabel("Money won this game: $0");

        //adding all stat boxes to the panel
        counters.add(gamespl);
        counters.add(gameswn);
        counters.add(gamesmn);
        counters.add(thismn);
        //grid layout applied to arrange 4 notifications vertically
        counters.setLayout(new GridLayout(4,1));

        //main panel is created, where all of the secondary panels will be added
        JPanel main=new JPanel();
        main.setLayout (new BorderLayout());//borderlayout applied
        main.add (title, BorderLayout.NORTH);//adding title to the top
        main.add (pictures, BorderLayout.CENTER);//adding pictures in the middle
        main.add (buttons, BorderLayout.SOUTH);//buttons on the bottom
        main.add (counters, BorderLayout.EAST);//counter stats on the right side
        add(main);//adding the main panel onto the window
    }//end constructor

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("play"))
        {
            //adds one to the number of games played when play button is pressed
            games++;
            //gets random number between 1 and 77
            int num= (int)(Math.random() * ((77) + 1));
            //declaring the number which represents the image on the first box
            int onenum=0;
            if (num<=40)
            {
                one.setIcon(createImageIcon ("1.png"));//changes picture
                onenum=1;//sets number to 1, indicating first picture is selected
            }//same as above 
            else if(num<=60)
            {
                one.setIcon(createImageIcon ("2.png"));
                onenum=2;
            }
            else if(num<=70)
            {
                one.setIcon(createImageIcon ("3.png"));
                onenum=3;
            }
            else if(num<=76)
            {
                one.setIcon(createImageIcon ("4.png"));
                onenum=4;
            }
            else if(num<=77)
            {
                one.setIcon(createImageIcon ("5.png"));
                onenum=5;
            }
            //getting a new random number
            num= (int)(Math.random() * ((77) + 1));

            //declaring the number which represents the image on the second box
            int twonum=0;
            //all comments on the if block below would be the same as the first
            if (num<=40)
            {
                two.setIcon(createImageIcon ("1.png"));
                twonum=1;
            }
            else if(num<=60)
            {
                two.setIcon(createImageIcon ("2.png"));
                twonum=2;
            }
            else if(num<=70)
            {
                two.setIcon(createImageIcon ("3.png"));
                twonum=3;
            }
            else if(num<=76)
            {
                two.setIcon(createImageIcon ("4.png"));
                twonum=4;
            }
            else if(num<=77)
            {
                two.setIcon(createImageIcon ("5.png"));
                twonum=5;
            }
            //new random number
            num= (int)(Math.random() * ((77) + 1));
            //declaring the number which represents the image on the third box
            int thrnum=0;
            //all comments on the if block below would be the same as the first
            if (num<=40)
            {
                thr.setIcon(createImageIcon ("1.png"));
                thrnum=1;
            }
            else if(num<=60)
            {
                thr.setIcon(createImageIcon ("2.png"));
                thrnum=2;
            }
            else if(num<=70)
            {
                thr.setIcon(createImageIcon ("3.png"));
                thrnum=3;
            }
            else if(num<=76)
            {
                thr.setIcon(createImageIcon ("4.png"));
                thrnum=4;
            }
            else if(num<=77)
            {
                thr.setIcon(createImageIcon ("5.png"));
                thrnum=5;
            }
            //finding if the images are the same and determining the prize
            if (onenum==twonum&&twonum==thrnum&&thrnum==1)//if all images are the first one
            {
                thismn.setText("Money won this game: $20");//changing the notification box to show reward
                money+=20;//adding 20 to the total money the user has
                won++;//adding one to the amount of wins
            }//all boxes below do the same thing, with different rewards
            else if (onenum==twonum&&twonum==thrnum&&thrnum==2)//if all images are the second picture
            {
                thismn.setText("Money won this game: $50");
                money+=50;
                won++;
            }
            else if (onenum==twonum&&twonum==thrnum&&thrnum==3)
            {
                thismn.setText("Money won this game: $100");
                money+=100;
                won++;
            }
            else if (onenum==twonum&&twonum==thrnum&&thrnum==4)
            {
                thismn.setText("Money won this game: $500");
                money+=500;
                won++;
                //if player ins the second prize, all message boxes become purple
                thismn.setForeground(new Color(255,15,249));
                gamespl.setForeground(new Color(255,15,249));
                gamesmn.setForeground(new Color(255,15,249));
                gameswn.setForeground(new Color(255,15,294));
            }
            else if (onenum==twonum&&twonum==thrnum&&thrnum==5)
            {
                thismn.setText("Money won this game: $1000");
                money+=1000;
                won++;
                //if player wins jackpot, all message boxes become golden
                thismn.setForeground(new Color(255,201,14));
                gamespl.setForeground(new Color(255,201,14));
                gamesmn.setForeground(new Color(255,201,14));
                gameswn.setForeground(new Color(255,201,14));
            }
            else 
            {
                thismn.setText("Money won this game: $0");//if the pictures dont match, this message is displayed
            }
            //updating all 4 notification labels with current info
            gamesmn.setText("Total money earned: $"+money);
            gamespl.setText("Games played: "+games);
            gameswn.setText("Games won: "+won);
            gamespl.setText("Games played: "+games+"");
        }
        if (e.getActionCommand().equals("reset"))
        {
            //resetting all of the stat numbers
            money=0;
            won=0;
            games=0;
            //updating all message boxes
            gamespl.setText("Games played: 0");
            gameswn.setText("Games won: 0");
            gamesmn.setText("Total money earned: $0");
            thismn.setText("Money won this game: $0");
        }
    }

    protected static ImageIcon createImageIcon (String path){
        java.net.URL imgURL = jackpot777.class.getResource( path);
        if (imgURL != null){
            return new ImageIcon (imgURL);
        } else {
            System.err.println( "Couldn't find file: " + path);
            return null;
        }
    }//end ImageIcon
}