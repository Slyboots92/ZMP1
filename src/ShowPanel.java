import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ShowPanel extends JPanel{
	
	private  JButton testButton;
	private JTextArea textArea;
	
	public ShowPanel(){
		testButton = new JButton("test");
		textArea = new JTextArea();
		textArea.setText("test");
		
		ShowActionListener listener = new ShowActionListener();
		testButton.addActionListener(listener);
		setLayout(new BorderLayout());
		
		add(testButton,BorderLayout.NORTH);
		add(textArea,BorderLayout.CENTER);
		
	}

}
