import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
public static void main(String[] args) {
	CutenessTV tv = new CutenessTV();
	tv.createUI();
}
	public void createUI(){
	frame = new JFrame();
	frame.setVisible(true);
	 panel = new JPanel();
	frame.add(panel);
	
	button1 = new JButton("Ducks");
	panel.add(button1);
	button1.addActionListener(this);
	button2 = new JButton("Frogs");
	panel.add(button2);
	button2.addActionListener(this);
	button3 = new JButton("Fluffy Unicorns");
	panel.add(button3);
	button3.addActionListener(this);
	frame.pack();
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if(b.equals(button1)) {
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}
		else if(b.equals(button2)) {
			playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}
		else {
			playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}
		
	}

}
