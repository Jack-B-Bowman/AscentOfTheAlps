
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class AnimationWindow extends JPanel {

<<<<<<< HEAD
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
=======
	/**
	 * Create the panel.
	 */
	public AnimationWindow() {
            JLabel Background = new JLabel("Background");
            JLabel Event = new JLabel("Event");
            JLabel Elephant = new JLabel("Elephants");
            
            Background.setBounds(0,0,785,215);
            
	}
        
>>>>>>> 1c835ff589daa495c09d9f277ed9880ee8b7aa1c
}
