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

    JPanel panel1 = new JPanel(new GridLayout(1, 1, 20, 20));

    //------Button1-------//
    JButton button1 = new JButton("Button1"); 
    JButton button2 = new JButton("Button2");
    panel1.add(button1);
    panel1.add(button2);
    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
  }// end of main method
}// end of class main