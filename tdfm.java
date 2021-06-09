import java.util.*;
import java.awt.*;
import javax.swing.*;

public class tdfm extends JFrame{

  public tdfm(){
    this.setTitle("TodoForMe");
    this.setSize(300,200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
  }

  public static void main(String[] args){
    System.out.println(" Let's start TdFM!! ");
    tdfm frame = new tdfm();
    Container cont = frame.getContentPane();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("TodoForMe!!");
    label.setFont(new Font("Arial",Font.PLAIN,48));
    label.setForeground(Color.RED);
    panel.add(label);
    JButton button = new JButton("yeah!!");
    panel.add(button);

    cont.add(panel,BorderLayout.CENTER);
    frame.setVisible(true);
  }


}
