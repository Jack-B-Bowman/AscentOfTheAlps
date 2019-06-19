
import java.awt.Font;
import java.time.LocalDate;
import java.time.Year;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 *
 * @author Taylor Conn
 */
public class PlayerStats extends JPanel {

    static int dayOfYear = 1;
    static Year y = Year.of(-218);
    static LocalDate ld = y.atDay(dayOfYear);
    static JLabel lblDate = new JLabel("Date: " + ld);
    static JLabel lblDistance = new JLabel("Distance: " + Inventory.Distance);
    static JLabel lblHealth = new JLabel("Health: " + Var.health);
    static boolean ab = false;
    // date calculator for the GUI
    public static void SetLblDate() {
        lblDate.setText("Date: " + ld);
    }

    public static void setHealthLbl() {
        lblHealth.setText("Health: " + Var.health);
    }

    public static void SetLblDistance() {

        lblDistance.setText("Distance: " + Inventory.Distance);
    }

    public static void callTogether() throws InterruptedException {
        SetLblDistance();
        SetLblDate();
        setHealthLbl();
        // call and update both the distance label and date label
    }

    public PlayerStats() {
        setBounds(20, 20, 800, 250);
        setLayout(null);
        lblDistance.setBounds(10, 10, 600, 40);
        lblDistance.setFont(new Font("Serif", Font.BOLD, 22));
        add(lblDistance);
        lblDate.setBounds(10, 50, 600, 40);
        lblDate.setFont(new Font("Serif", Font.BOLD, 22));
        add(lblDate);
        lblHealth.setBounds(10, 90, 600, 40);
        lblHealth.setFont(new Font("Serif", Font.BOLD, 22));
        add(lblHealth);
        //GUI module for distance and date displayed on GUI
    }
}
