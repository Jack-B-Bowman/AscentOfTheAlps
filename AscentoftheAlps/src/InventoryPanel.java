import javax.swing.JPanel;
import javax.swing.JLabel;

public class InventoryPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public InventoryPanel() {
		setBounds(0, 0, 785, 215);
		setLayout(null);
		
		JLabel lblFood = new JLabel("food");
		lblFood.setBounds(20, 10, 100, 15 );
		add(lblFood);
                lblFood.setVisible(true);
		
		JLabel LblMen = new JLabel("men");
		LblMen.setBounds(20, 30, 100, 15);
		add(LblMen);
		
		JLabel lblElephants = new JLabel("Elephants");
		lblElephants.setBounds(20, 50, 100, 15);
		add(lblElephants);
		
	}

}
