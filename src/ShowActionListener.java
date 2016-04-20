import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(" source "+e.getSource());
		System.out.println("when "+e.getWhen());
	}

}
