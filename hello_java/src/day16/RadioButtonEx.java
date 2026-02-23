package day16;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
public class RadioButtonEx extends JFrame{
public RadioButtonEx() {
setTitle("라디오버튼만들기예제");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c = getContentPane();
c.setLayout(new FlowLayout());

ImageIcon icon = new ImageIcon("images/RYAN_1.jpg");
Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
icon = new ImageIcon(image);

ImageIcon selectIcon = new ImageIcon("images/RYAN_2.jpg");
image = selectIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
selectIcon = new ImageIcon(image);

ButtonGroup g = new ButtonGroup();
JRadioButton apple = new JRadioButton("사과");
JRadioButton pear = new JRadioButton("배", true);
JRadioButton cherry = new JRadioButton(icon);
cherry.setBorderPainted(true);
cherry.setSelectedIcon(selectIcon);
g.add(apple);
g.add(pear);
g.add(cherry);
c.add(apple);
c.add(pear);
c.add(cherry);
setSize(250,150);
setVisible(true);
}
public static void main(String [] args) {
new RadioButtonEx();
}
}
