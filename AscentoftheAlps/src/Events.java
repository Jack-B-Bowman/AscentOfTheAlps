
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Taylor Conn I built dis with the guidence and psudocode of Aidan and Jack
 */
public class Events extends JPanel {

    static Random actOfGod = new Random();

    public static void mutiny() {
        JOptionPane.showMessageDialog(null, "Your Crew Has Abandoned You And Have Taken All of your Elephants");
        Inventory.Elephants = 0.0;

        if (Var.hasChef) {
            Var.chefDie();
        }
        if (Var.hasDog) {
            Var.dogDie();
        }
        if (Var.hasElephantTamer) {
            Var.elephantTamerDie();
        }
        if (Var.hasHunter) {
            Var.hunterDie();
        }
        if (Var.hasMerchant) {
            Var.merchantDie();
        }
        if (Var.hasNavigator) {
            Var.navigatorDie();
        }
        if (Var.hasPreist) {
            Var.presitDie();
        }
    }

    public static void runEvents() {
        int chance = actOfGod.nextInt(50) + 1;
        System.out.println(chance);
        switch (chance) {
            case (1):
                mutiny();
                break;
            case (2):
                break;
            case (3):
                break;
            case (4):
                break;
            case (5):
                break;
            case (6):
                break;
            case (7):
                break;
            case (8):
                break;
            case (9):
                break;
            case (10):
                break;
            case (11):
                break;
            case (12):
                break;
            case (13):
                break;
            case (14):
                break;
            case (15):
                break;
            case (16):
                break;
            case (17):
                break;
            case (18):
                break;
            case (19):
                break;
            case (20):
                break;
            case (21):
                break;
            case (22):
                break;
            case (23):
                break;
            case (24):
                break;
            case (25):
                break;
            case (26):
                break;
            case (27):
                break;
            case (28):
                break;
            case (29):
                break;
            case (30):
                break;
            case (31):
                break;
            case (32):
                break;
            case (33):
                break;
            case (34):
                break;
            case (35):
                break;
            case (36):
                break;
            case (37):
                break;
            case (38):
                break;
            case (39):
                break;
            case (40):
                break;
            case (41):
                break;
            case (42):
                break;
            case (43):
                break;
            case (44):
                break;
            case (45):
                break;
            case (46):
                break;
            case (47):
                break;
            case (48):
                break;
            case (49):
                break;
            case (50):
                break;
        }
    }
}
