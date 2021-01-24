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

    JPanel panel1 = new JPanel(new GridLayout(1,1, 20, 20));

    //------Button1-------//
    JButton button1 = new JButton("Button1"); 
    //------Button2-------//
    JButton button2 = new JButton("Button2");
    //--------Panel 2--------//
    JPanel panel2 = new JPanel(new BorderLayout(10, 10));
    //------Image1-------//
    ImageIcon mailImg = new ImageIcon("mail.png", "A Mail Icon");
    JLabel mailPic = new JLabel(mailImg);

    panel1.add(button1);
    panel1.add(button2);
    panel2.add(mailPic);
    
    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
    frame1.getContentPane().add(BorderLayout.SOUTH, panel2);
  }// end of main method
}// end of class main