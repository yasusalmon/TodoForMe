import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class tdfm extends JFrame implements ActionListener{

  public static void main(String[] args){
    System.out.println(" Let's start TdFM!! ");
    tdfm frame = new tdfm();
    frame.setVisible(true);

  }

  int iii = 0;
  int subject = 0;
  int page = 0;

  JLayeredPane panel = new JLayeredPane();
  JLabel title_name = new JLabel("TodoForMe!!");
  JButton button1 = new JButton(" yeah!!");
  JButton button2 = new JButton("yeah2!!");
  JLabel TodoImage[] = new JLabel[1000000];
  JLabel TodoText[] = new JLabel[1000000];
  ImageIcon todoback = new ImageIcon("./TodoBGP_x300y45.png");
  ImageIcon todoinput = new ImageIcon("./TodoBGP_x300y65.png");
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

    title_name.setFont(new Font("Arial",Font.PLAIN,32));
    title_name.setForeground(new Color (200,200,0));
    //title_name.setForeground(Color.RED);
    //title_name.setHorizontalAlignment(JLabel.CENTER);
    title_name.setBounds(0,-140,300,320);
    panel.add(title_name);

    button1.setBounds(300,55,150,50);
    button2.setBounds(20,300,150,30);
    button1.addActionListener(this);
    button2.addActionListener(this);
    panel.add(button1);
    panel.add(button2);

    cont.add(panel,BorderLayout.CENTER);

    //kokokarasaki ittann karioki
    //kannsei sakuhinn deha data ha textfile de kannri suru yotei
    // button[0] = new JButton("1");
    // button[1] = new JButton("2");
    // button[2] = new JButton("3");
    // button[3] = new JButton("ãããã");
    // button[0].setBounds(300,150,150,32);
    // panel.add(button[0]);
    // button[1].setBounds(300,200,150,32);
    // panel.add(button[1]);
    // button[2].setBounds(300,250,150,32);
    // panel.add(button[2]);
    // button[3].setBounds(300,300,150,32);
    // panel.add(button[3]);

    //input no ryouiki
    TodoImage[999999] = new JLabel(todoinput);
    TodoImage[999999].setBounds(175,45,300,65);
    panel.add(TodoImage[999999]);

    try{
      File file = new File("list.txt");
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);

      String slist;
      int i = 0;
      while((slist = br.readLine()) != null){
        String[] split_text = slist.split(",",0);
        //TodoText[1].setText("split_text[1]");
        if(TodoText[1] == null){
          System.out.println("null âÅ");
          System.exit(0);
        }
        TodoText[1].setBackground(Color.ORANGE);
        for(String elem : split_text){
          System.out.println(elem);
        }
      }
      br.close();
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }

    //todo no ryouiki
    // TodoImage[0] = new JLabel(todoback);
    // TodoImage[0].setBounds(175,120,300,45);
    // panel.add(TodoImage[0]);
  }

  public void actionPerformed(ActionEvent e){
    System.out.println("you push a button.");
    if(iii > 6){

    }else if(e.getSource() == button1){
      button[iii] = new JButton("uouo");
      button[iii].setBounds(340,170+(iii*50),100,30);
      panel.add(button[iii]);
      TodoImage[iii] = new JLabel(todoback);
      TodoImage[iii].setBounds(175,110+(iii*50),300,150);
      panel.add(TodoImage[iii]);
      iii++;
      TodoText[iii].setForeground(new Color (200,200,0));
      TodoText[iii].setBounds(0,-140,300,320);
      panel.add(TodoText[iii]);
    }else if(e.getSource() == button2){
      button[iii] = new JButton("ieie");
      button[iii].setBounds(340,170+(iii*50),100,30);
      panel.add(button[iii]);
      TodoImage[iii] = new JLabel(todoback);
      TodoImage[iii].setBounds(175,110+(iii*50),300,150);
      panel.add(TodoImage[iii]);
      iii++;
    }
  }

}
