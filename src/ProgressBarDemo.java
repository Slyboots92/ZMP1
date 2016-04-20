import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressBarDemo extends JFrame {

	
	public ProgressBarDemo(){
		setSize(400, 400);
		
		setLayout(new BorderLayout());
		bar= new JProgressBar(0,100);
		add(bar,BorderLayout.CENTER);
		setVisible(true);
	}
	
	private JProgressBar bar;
	public JProgressBar getBar() {
		return bar;
	}
	public void setBar(JProgressBar bar) {
		this.bar = bar;
	}
	
}
