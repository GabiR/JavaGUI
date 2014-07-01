import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FirstAppGUI {

	
	private static class FirstDisplay extends JPanel {
		
		public void paintComponent (Graphics g) {
			super.paintComponent(g);
			g.drawString("#SWAG", 20, 35);
		}	
		
	}
	
	private static class ButtonHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent ev) {
			System.exit(0);
		}
	}
	
	public static void main(String [] args) {
		FirstDisplay fd = new FirstDisplay();
		JButton button = new JButton("Cancel");
		ButtonHandler bh = new ButtonHandler();
		button.addActionListener(bh);
		JPanel content = new JPanel();
		
		content.setLayout(new BorderLayout());
		content.add(fd, BorderLayout.CENTER);
		content.add(button, BorderLayout.SOUTH);
		
		JFrame win = new JFrame("YOLOOO");
		win.setContentPane(content);
		win.setSize(700, 300);
		win.setVisible(true);
		
	}
	

}
