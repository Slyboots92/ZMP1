import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class LeftTableTableModel extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4633698884390822574L;

	private ArrayList<String > records;
	public  LeftTableTableModel(ArrayList<String> records) {
		this.records=records;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return records.size();
	}

	@Override
	public int getColumnCount() {
		return 1;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return records.get(rowIndex);
	}

}
