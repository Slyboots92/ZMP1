import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class MIddlePanel extends JPanel{

	private JButton uploadButton;
	private JButton downloadButton;
	private JTextArea infoArea;
	private JProgressBar progressBar;
	public MIddlePanel(){
		uploadButton = new JButton("wyslij");
		downloadButton = new JButton("pobierz");
		infoArea = new JTextArea();
		progressBar = new JProgressBar(0, 100);
		progressBar.setValue(40);
		setLayout(new GridLayout(6, 1));
		add(uploadButton);
		add(downloadButton);
		add(infoArea);
		add(progressBar);
/*		setLayout(new BorderLayout());
		add(uploadButton,BorderLayout.NORTH);
		add(downloadButton,BorderLayout.CENTER);
		add(infoArea);*/
	}
}
