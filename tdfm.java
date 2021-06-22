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

  int i = 4;

  JLayeredPane panel = new JLayeredPane();
  JLabel label = new JLabel("TodoForMe!!");
  JButton button1 = new JButton("yeah!!");
  JButton button2 = new JButton("yeah2!!");
  JButton button[] = new JButton[1000000];

  public tdfm(){
    this.setTitle("TodoForMe");
    this.setSize(500,600);
    //this.setResizable(false);size no kotei ha sinai. demo dottidemo ii.
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocation(770,30);//migiue ni kuruyou ni sitearu
    Container cont = this.getContentPane();

    panel.setLayout(null);//jidou layout wo off ni siteiru
    panel.setBackground(Color.WHITE);//haikei color

    label.setFont(new Font("Arial",Font.PLAIN,32));
    //label.setForeground(Color.RED);
    label.setForeground(new Color (200,200,0));
    //label.setHorizontalAlignment(JLabel.CENTER);
    label.setBounds(0,-140,300,320);
    panel.add(label);

    button1.setBounds(300,50,150,50);
    button2.setBounds(50,300,150,64);
    button1.addActionListener(this);
    button2.addActionListener(this);
    panel.add(button1);
    panel.add(button2);

    cont.add(panel,BorderLayout.CENTER);

    //kokokarasaki ittann karioki
    //kannsei sakuhinn deha data ha textfile de kannri suru yotei
    button[0] = new JButton("1kome");
    button[1] = new JButton("2kome");
    button[2] = new JButton("3kome");
    button[3] = new JButton("4kome");
    button[0].setBounds(300,150,150,32);
    panel.add(button[0]);
    button[1].setBounds(300,200,150,32);
    panel.add(button[1]);
    button[2].setBounds(300,250,150,32);
    panel.add(button[2]);
    button[3].setBounds(300,300,150,32);
    panel.add(button[3]);
  }

  public void actionPerformed(ActionEvent e){
    System.out.println("you push a button.");
    if(e.getSource() == button1){
      button[i] = new JButton("uouo");
      button[i].setBounds(300,150+(i*50),150,32);
      panel.add(button[i]);
      i++;
    }else if(e.getSource() == button2){
      button[i] = new JButton("ieie");
      button[i].setBounds(300,150+(i*50),150,32);
      panel.add(button[i]);
      i++;
    }
  }

  public void AddTodo(tdfm frame){

  }

}
