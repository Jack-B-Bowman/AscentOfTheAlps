
import javax.swing.JPanel;
import javax.swing.JLabel;

public class InventoryPanel extends JPanel {

    JLabel lblFood = new JLabel("food");
    JLabel lblMen = new JLabel("men");
    JLabel lblElephants = new JLabel("Elephants");

    /**
     * Create the panel.
     */
    public InventoryPanel() {
        setBounds(0, 0, 785, 215);
        setLayout(null);

        //JLabel lblFood = new JLabel("food");
        lblFood.setBounds(20, 10, 100, 15);
        add(lblFood);
        lblFood.setVisible(true);

        //JLabel LblMen = new JLabel("men");
        lblMen.setBounds(20, 30, 100, 15);
        add(lblMen);

        //JLabel lblElephants = new JLabel("Elephants");
        lblElephants.setBounds(20, 50, 100, 15);
        add(lblElephants);


    }

    public void SetLblFood(String s) {
        lblFood.setText("Food: " + s);
    }

    public void SetLblMen(String s) {
        lblMen.setText("Men: " + s);
    }

    public void SetLblElephants(String s) {
        lblElephants.setText("Elephants: " + s);
    }
}
