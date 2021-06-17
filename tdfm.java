import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class tdfm extends JFrame implements ActionListener{

  public tdfm(){
    this.setTitle("TodoForMe");
    this.setSize(800,600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    Container cont = this.getContentPane();
    JPanel panel = new JPanel();
    panel.setLayout(null);
    JLabel label = new JLabel("TodoForMe!!");
    label.setFont(new Font("Arial",Font.PLAIN,48));
    label.setForeground(Color.RED);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setBounds(0,0,350,320);
    panel.add(label);
    JButton button = new JButton("yeah!!");
    button.setBounds(250,300,150,32);
    JButton button2 = new JButton("yeah2!!");
    button2.setBounds(450,300,150,64);
    button.addActionListener(this);
    panel.add(button);
    panel.add(button2);

    cont.add(panel,BorderLayout.CENTER);
  }

  public static void main(String[] args){
    System.out.println(" Let's start TdFM!! ");
    tdfm frame = new tdfm();

    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    System.out.println("aaa");
  }
}
