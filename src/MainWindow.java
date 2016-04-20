import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class MainWindow extends JFrame{
	
	public MainWindow(int width,int height){
		setSize(width,height);
		setLayout(new GridLayout(1,3));
		LeftPanel leftPanel= new LeftPanel();
		MIddlePanel middle = new MIddlePanel();
		RightPanel rightPanel = new RightPanel();
		
		add(leftPanel);
		add(middle);
		add(rightPanel);
		setVisible(true);
	}

}
