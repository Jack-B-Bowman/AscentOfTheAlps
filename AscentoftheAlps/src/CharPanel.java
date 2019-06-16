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
	 * @throws IOException 
	 */
	public CharPanel() throws IOException {
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setSize(299,110);
		setLayout(null);
		
		JLabel CharIcon = new JLabel("New label");
		CharIcon.setBounds(0, 10, 90, 90);
		add(CharIcon);
		BufferedImage icon = ImageIO.read(this.getClass().getResource("/NPC.png"));
		CharIcon.setIcon(new ImageIcon(icon));
		
		
		JLabel Name = new JLabel("New label");
		Name.setBounds(100, 10, 100, 15);
		add(Name);
                
                JComboBox teamList = new JComboBox(Var.team);	
                teamList.setBounds(100, 45, 180, 25);              
                add(teamList);
	}
}
