import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Year;
import javax.imageio.ImageIO;
import javax.swing.*;

public class AnimationWindow extends JPanel {
   
    //Creates the panel where the distance and image are kept
    public AnimationWindow() throws IOException {
        JLabel background = new JLabel();
        background.setBounds(0, 0, 0, 0);
        add(background);
        BufferedImage icon = ImageIO.read(this.getClass().getResource("/Title4.png"));
        background.setIcon(new ImageIcon(icon));   
    }
}
