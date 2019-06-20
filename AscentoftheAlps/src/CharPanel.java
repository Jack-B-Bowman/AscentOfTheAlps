
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class CharPanel extends JPanel {

    /**
     * Create the panel.
     *
     * @throws IOException
     */
    String path = "/NPC.png";
    JLabel CharIcon = new JLabel("New label");

    //defines what the character panel will look like
    public CharPanel() throws IOException {
        setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        setSize(299, 110);
        setLayout(null);

        CharIcon.setBounds(4, 10, 90, 90);
        add(CharIcon);
        BufferedImage icon = ImageIO.read(this.getClass().getResourceAsStream(path));
        CharIcon.setIcon(new ImageIcon(icon));
    }

    //sets the character image
    public void setIcon(String s) throws IOException {
        path = s;
        BufferedImage icon = ImageIO.read(this.getClass().getResourceAsStream(path));
        CharIcon.setIcon(new ImageIcon(icon));
    }
}
