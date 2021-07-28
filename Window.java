import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Window extends JFrame{
  public Window(){
    setSize(564,824);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImageIcon img = new ImageIcon("bg.jpg");
    JLabel bg = new JLabel("",img,JLabel.CENTER);
    bg.setBounds(0,0,564,824);
    add(bg);
    setResizable(false);
    setVisible(true);
  }
  public void Render(){
    
  }
  public static void main(String[] args) {
    new Window();
  }
}
