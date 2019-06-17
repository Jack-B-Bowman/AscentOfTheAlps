
import java.time.LocalDate;
import java.time.Year;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class InventoryPanel extends JPanel {

  static int dayOfYear = 308 ;
  static Year y = Year.of( -218 ) ;
  static LocalDate ld = y.atDay(dayOfYear);
  static JLabel lblFood = new JLabel("Food:" + Inventory.foodSupply);
  static  JLabel lblElephants = new JLabel("Elephants:" + Inventory.Elephants);
  static  JLabel lblBullets = new JLabel("Bullets:" + Inventory.Bullets);
  static  JLabel lblMedicine = new JLabel("Medicine:" + Inventory.Medicine);
  static  JLabel lblRepairkits = new JLabel("Repair Kits:" + Inventory.Repairkits);
  static JLabel lblDate = new JLabel("Date: " + ld);
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
        
        lblDate.setBounds(20, 110, 100, 15);
        add(lblDate);
    }

   public static void SetLblFood() {

       lblFood.setText("Food:" + Inventory.foodSupply);
   }

   public static void SetLblDate() {

       lblDate.setText("Date:" + ld);
   }
    public static void SetLblElephants() {
        lblElephants.setText("Elephants:" + Inventory.Elephants);
    }
    //Aidcode
    public static void SetLblBullets() {
        lblBullets.setText("Bullets:" + Inventory.Bullets);
    }
    public static void SetLblRepairkits() {
        lblRepairkits.setText("Medicine:" + Inventory.Medicine);
    }
    public static void SetLblMedicine() {
        lblMedicine.setText("Repair Kits:" + Inventory.Repairkits);
    }
    int i = 0;

    public static void updateInventory() throws InterruptedException{
        SetLblFood();
        SetLblElephants();
        SetLblBullets();
        SetLblRepairkits();
        SetLblMedicine();
        SetLblDate();
        Thread.sleep(100);
    }
}
