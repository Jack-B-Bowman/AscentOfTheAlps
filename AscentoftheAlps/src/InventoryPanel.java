
import java.time.LocalDate;
import java.time.Year;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InventoryPanel extends JPanel {

    static JLabel lblFood = new JLabel("Food: " + Inventory.foodSupply);
    static JLabel lblElephants = new JLabel("Elephants: " + Inventory.Elephants);
    static JLabel lblBullets = new JLabel("Bullets: " + Inventory.Bullets);
    static JLabel lblMedicine = new JLabel("Medicine: " + Inventory.Medicine);
    static JLabel lblRepairkits = new JLabel("Repair Kits: " + Inventory.Repairkits);
    static boolean halhway = false;
    static boolean done = false;

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

    public static void SetLblFood() {

        lblFood.setText("Food: " + (int) Inventory.foodSupply);
    }

    public static void SetLblElephants() {
        lblElephants.setText("Elephants: " + Inventory.Elephants);
    }

    //Aidcode
    // setting labels on the inventory part of the gui
    public static void SetLblBullets() {
        lblBullets.setText("Bullets:" + Inventory.Bullets);
    }

    public static void SetLblRepairkits() {
        lblRepairkits.setText("Medicine:" + Inventory.Medicine);
    }

    public static void SetLblMedicine() {
        lblMedicine.setText("Repair Kits:" + Inventory.Repairkits);
    }

    public static void halfway() {
        if (Inventory.Distance < 1790 && !InventoryPanel.halhway) {
            JOptionPane.showMessageDialog(null, "Your Journey is Halfway Complete. Carry on brave one");
            InventoryPanel.halhway = true;
        }
    }

    public static void isDone() {
        if (Inventory.Distance <= 0 && !InventoryPanel.done) {
            JOptionPane.showMessageDialog(null, "Your Journey is Complete. How are a strategic genius and deserve the highest of praise. Godspeed");
            InventoryPanel.done = true;
            AscentoftheAlps.outlogger.close();
            System.exit(0);
        }
    }

    public static void outOfFood() {
        if (Inventory.foodSupply <= 0) {
            Inventory.foodSupply = 0;
            Var.health--;
            JOptionPane.showMessageDialog(null, "You ran out of food and thus have lost 1 health");
        }
    }

    public static void updateInventory() throws InterruptedException {
        SetLblFood();
        SetLblElephants();
        SetLblBullets();
        SetLblRepairkits();
        SetLblMedicine();
        Thread.sleep(100);
        //updates inventory by setting the labels and then waiting on call
    }
}
