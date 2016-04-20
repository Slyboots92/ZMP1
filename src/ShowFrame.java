import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ShowFrame extends JFrame{

	
	public ShowFrame(int width ,int height){
		setSize(width,height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Toolkit toolkit = getToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		setLocation( screenSize.height/2,screenSize.width/2);
		getContentPane().setBackground(new Color(0, 200, 0));
		setTitle("Pokazowe okno");
		setLayout(new GridLayout(2, 2));
		//add( new ShowPanel());
		LeftPanel leftPanel = new LeftPanel();
		add(leftPanel);
		setVisible(true);
	}
}
