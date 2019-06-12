
import javax.swing.JPanel;
import javax.swing.JLabel;

public class InventoryPanel extends JPanel {

    JLabel lblFood = new JLabel("Food:");
    JLabel lblElephants = new JLabel("Elephants:");
    JLabel lblBullets = new JLabel("Bullets:");
    JLabel lblMedicine = new JLabel("Medicine:");
    JLabel lblRepairkits = new JLabel("Repair Kits:");
    /**
     * Create the panel.
     */
    public InventoryPanel() {
        setBounds(0, 0, 785, 215);
        setLayout(null);

        //JLabel lblFood = new JLabel("food");
        lblFood.setBounds(20, 10, 100, 15);
        add(lblFood);

        //JLabel lblElephants = new JLabel("Elephants");
        lblElephants.setBounds(20, 30, 100, 15);
        add(lblElephants);
        //Aidcode
        lblBullets.setBounds(20, 50, 100, 15);
        add(lblBullets);
        
        lblMedicine.setBounds(20, 70, 100, 15);
        add(lblMedicine);
        
        lblRepairkits.setBounds(20, 90, 100, 15);
        add(lblRepairkits);
    }

    public void SetLblFood(String s) {
        lblFood.setText("Food: " + s);
    }

    public void SetLblElephants(String s) {
        lblElephants.setText("Elephants: " + s);
    }
    //Aidcode
    public void SetLblBullets(String s) {
        lblBullets.setText("Bullets: " + s);
    }
    public void SetLblRepairkits(String s) {
        lblBullets.setText("Repair Kits: " + s);
    }
    public void SetLblMedicine(String s) {
        lblMedicine.setText("Medicine: " + s);
    }   
}
