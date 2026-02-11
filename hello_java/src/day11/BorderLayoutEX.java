package day11;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;



import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEX extends JFrame {
	public BorderLayoutEX() {
		setTitle("ㅋㅋㅋ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout(10,10));
	

	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
		c.add(btn1,BorderLayout.WEST);
		c.add(btn2,BorderLayout.EAST);
			c.add(btn3,BorderLayout.CENTER);

	setSize(400,300);
		 setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutEX();
	}
}