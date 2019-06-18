
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

}
catch(IOException e){
	e.printStackTrace();
}
repaint();
}

public void paint(Graphics g) {
 g.drawImage(img ,0,0, null);
}
}