import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class tdfm extends JFrame implements ActionListener{

  public static void main(String[] args){
    System.out.println(" Let's start TdFM!! ");
    tdfm frame = new tdfm();

    frame.setVisible(true);
  }

  public tdfm(){
    this.setTitle("TodoForMe");
    this.setSize(500,600);
    //this.setResizable(false);size no kotei ha sinai. demo dottidemo ii.
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocation(770,30);//migiue ni kuruyou ni sitearu
    Container cont = this.getContentPane();
    JPanel panel = new JPanel();
    panel.setLayout(null);//jidou layout wo off ni siteiru
    panel.setBackground(Color.WHITE);//haikei color
    JLabel label = new JLabel("TodoForMe!!");
    label.setFont(new Font("Arial",Font.PLAIN,48));
    //label.setForeground(Color.RED);
    label.setForeground(new Color (200,200,0));
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setBounds(0,0,350,320);
    panel.add(label);
    JButton button = new JButton("yeah!!");
    button.setBounds(50,300,150,32);
    JButton button2 = new JButton("yeah2!!");
    button2.setBounds(250,300,150,64);
    button.addActionListener(this);
    button2.addActionListener(this);
    panel.add(button);
    panel.add(button2);

    cont.add(panel,BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e){
    System.out.println("aaa");
  }

  public void AddTodo(tdfm frame){

  }

}
