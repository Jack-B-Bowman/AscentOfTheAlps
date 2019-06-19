
import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class AnimationWindow extends Canvas {

    /**
     *
     */
    BufferedImage img;

    {

        try {
            img = ImageIO.read(getClass().getResourceAsStream("/Title4.png"));

        } catch (IOException e) {
        }
        repaint();
    }

    //adds the title image and sets it in the center of the panel
    @Override
    public void paint(Graphics g) {
        g.translate(this.getWidth() / 2, this.getHeight() / 2);
        g.translate(-img.getWidth(null) / 2, -img.getHeight(null) / 2);
        g.drawImage(img, 0, 0, null);
    }
}
