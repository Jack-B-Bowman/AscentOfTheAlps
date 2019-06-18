
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
    static int dayOfYear = 308;
    static Year y = Year.of(-218);
    static LocalDate ld = y.atDay(dayOfYear);
    static JLabel lblDate = new JLabel("Date: " + ld);
    static JLabel lblDistance = new JLabel("Distance: " + Inventory.Distance);

    public static void SetLblDate() {
        lblDate.setText("Date:" + ld);
    }

    public static void SetLblDistance() {

        lblDistance.setText("Distance:" + Inventory.Distance);
    }

    public static void callTogether() throws InterruptedException{
        SetLblDistance();
        SetLblDate();
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
    }
}
