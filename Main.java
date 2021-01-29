import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Main 
{
  public static void main (String args[])
  {
    JFrame frame1 = new JFrame("This is a JFrame");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // You must have this line
    frame1.setSize(500,500);
    frame1.setVisible(true);

    JPanel panel1 = new JPanel(new GridLayout(3, 3, 20, 20));
    JTextField textfield1 = new JTextField(10);

    JTextField textfield2 = new JTextField(10);
    //------Button1-------//
    JButton button1 = new JButton("P1 Random Phrase");
    button1.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            String[] phrases = {"Counting ducks", "You counted to", "Look at you count", "Nice one there", "Keep Going!"};
            System.out.println("P1 Says - " + phrases[(int)(Math.random() * phrases.length)]);
            
          }//end the block of what the button will do
      }); //end the ActionListener 
    //------Button2-------//
    JButton button2 = new JButton("P2 Random Phrase");
    button2.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            String[] phrases = {"Counting ducks", "You counted to", "Look at you count", "Nice one there", "Keep Going!"};
            System.out.println("P2 Says - " + phrases[(int)(Math.random() * phrases.length)]);
            
          }//end the block of what the button will do
      }); //end the ActionListener 
    //------Button3-------//
    JButton button3 = new JButton("P1 Send Message");
    button3.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            System.out.println("P1: "+  textfield1.getText());
             textfield1.setText("");
          }//end the block of what the button will do
      }); //end the ActionListener 
    //------Button4-------//
    JButton button4 = new JButton("P2 Send Message");
    button4.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            System.out.println("P2: "+  textfield2.getText());
             textfield2.setText("");
          }//end the block of what the button will do
      }); //end the ActionListener
    //JTextField textfield2 = new JTextField(10);
    //--------Panel 2--------//
    JPanel panel2 = new JPanel(new BorderLayout(10, 10));
    //------Image1-------//
    ImageIcon mailImg = new ImageIcon("mail.png", "A Mail Icon");
    JLabel mailPic = new JLabel(mailImg);

    panel1.add(button1);
    panel1.add(button2);
    panel1.add(textfield1);
    panel1.add(textfield2);
    panel1.add(button3);
    panel1.add(button4);
    panel2.add(mailPic);

    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
    frame1.getContentPane().add(BorderLayout.SOUTH, panel2);
  }// end of main method
}// end of class main