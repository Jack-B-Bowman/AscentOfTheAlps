
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class AnimationWindow extends JPanel {

    /**
     * Create the panel.
     */
    public AnimationWindow() throws IOException {
        JLabel background = new JLabel("Background");
        JLabel event = new JLabel("Event");
        JLabel elephant = new JLabel("Elephants");
        BufferedImage pic = ImageIO.read(this.getClass().getResource("/Elephant.png"));


        background.setBounds(0, 0, 785, 215);
        add(background);
        
        
        elephant.setBounds(688,155,97,60);
        elephant.setIcon(new ImageIcon(pic));
        add(elephant);



    }
}
