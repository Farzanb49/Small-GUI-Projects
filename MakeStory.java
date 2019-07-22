
/**
 * Write a description of class MakeStory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;

public class MakeStory extends Applet implements ActionListener
{
    // Place instance variables here
    JTextField name2,adject2;
    JTextArea story;    

    public void init ()
    {
	resize(200,475);
	JLabel name = new JLabel("Name:   ");        
	name2 = new JTextField(10);
	JLabel adject = new JLabel("Adjective: ");        
	adject2 = new JTextField(10);
	JButton makeit = new JButton("Make a Story");
	makeit.addActionListener (this);
	makeit.setActionCommand ("what");
	story = new JTextArea(7,14);
	story.setLineWrap(true);
	
	add(name);
	add(name2);
	add(adject);
	add(adject2);
	add(makeit);
	add(story);
    } // init method
    
    public void actionPerformed (ActionEvent e)
    {
	if(e.getActionCommand().equals("what")) {
	    story.append("One day, a knight named ");
	    story.append(name2.getText());
	    story.append(" rode into town and asked for a ");
	    story.append(adject2.getText());
	    story.append(" horse. We told him to get lost.");
	}
    }    
} // LeftOrRight class