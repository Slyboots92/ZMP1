import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RightPanel extends JPanel {

	ArrayList<String> sampleRecords = new ArrayList<String>();

	public RightPanel(){
		sampleRecords.add("row 1");
		sampleRecords.add("row 2");
		sampleRecords.add("row 3");
		LeftTableTableModel model = new LeftTableTableModel(sampleRecords);
		JTable table = new JTable(model);

		// Add the table to a scrolling pane
		JScrollPane scrollPane = new JScrollPane( table );
		setLayout(new GridLayout(1, 3));
		add(scrollPane);
	}
}
