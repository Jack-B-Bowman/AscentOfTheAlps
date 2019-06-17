
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class AnimationWindow extends JPanel {

    /**
     * Create the panel.
     * @throws java.io.IOException
     */
    public AnimationWindow() throws IOException {
        JLabel background = new JLabel();
        background.setBounds(0, 0, 0, 0);
        add(background);
        BufferedImage icon = ImageIO.read(this.getClass().getResource("/Title.png"));
        background.setIcon(new ImageIcon(icon));
    }
}
