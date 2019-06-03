import javax.swing.JPanel;
import javax.swing.JLabel;

public class InventoryPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public InventoryPanel() {
		setBounds(0, 0, 785, 215);
		setLayout(null);
		
		JLabel lblElephant = new JLabel("Elephant");
		lblElephant.setBounds(677, 93, 46, 14);
		add(lblElephant);
		
		JLabel lblBackground = new JLabel("Background");
		lblBackground.setBounds(348, 57, 68, 14);
		add(lblBackground);
		
		JLabel lblEvent = new JLabel("Event");
		lblEvent.setBounds(67, 144, 46, 14);
		add(lblEvent);
		
	}

}
