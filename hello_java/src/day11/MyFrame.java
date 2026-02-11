package day11;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("HelloGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame=new MyFrame();
	}

}
