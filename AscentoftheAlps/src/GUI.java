
import java.awt.EventQueue;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class GUI {

    private JFrame appWindow;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    GUI window = new GUI();
                    window.appWindow.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     *
     * @throws IOException
     */
    public GUI() throws IOException {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     *
     * @throws IOException
     */
    private void initialize() throws IOException {
        appWindow = new JFrame();
        appWindow.setTitle("Ascent Of The Alps");
        appWindow.setResizable(false);
        appWindow.setBounds(100, 100, 450, 300);
        appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appWindow.setSize(800, 800);

        JPanel AnimationWindow = new JPanel();
        final AnimationWindow lol = new AnimationWindow();
        lol.setBounds(0, 5, 799, 220);
        lol.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        appWindow.getContentPane().add(lol);

        //creates the inventory panel
        final InventoryPanel invPanel = new InventoryPanel();
        invPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        invPanel.setBounds(352, 336, 432, 150);

        //creates inventory panel label
        JLabel lblNewLabel = new JLabel("Inventory");
        lblNewLabel.setBounds(352, 316, 87, 14);
        lblNewLabel.setLabelFor(invPanel);

        //creates playerstats panel
        final PlayerStats playerStats = new PlayerStats();
        playerStats.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        playerStats.setBounds(352, 510, 432, 150);

        //creates playerstats label
        JLabel lblPlayerStats = new JLabel("Player Stats");
        lblPlayerStats.setBounds(352, 490, 87, 14);
        lblPlayerStats.setLabelFor(playerStats);

        final JButton btnMap = new JButton("Map");
        btnMap.setBounds(352, 241, 87, 23);

        final JButton btnMove = new JButton("Move");
        btnMove.setBounds(352, 270, 87, 23);

        //if the move button is called
        btnMove.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (arg0.getSource() == btnMove) {

                    try {
                        AscentoftheAlps.movement = true;
                        AscentoftheAlps.day();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        });

        //if the map button is pressed
        btnMap.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                if (arg0.getSource() == btnMap) {
                    ImageIcon icon = new ImageIcon(getClass().getResource("/H.png"));
                    JOptionPane.showMessageDialog(invPanel, null, "Map", JOptionPane.INFORMATION_MESSAGE, icon);
                }
            }
        });

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(449, 241, 87, 23);

        final JButton btnCommitDie = new JButton("Suicide");
        btnCommitDie.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (arg0.getSource() == btnCommitDie) {
                    ImageIcon icon = new ImageIcon(getClass().getResource("/SG.png"));
                    JOptionPane.showMessageDialog(invPanel, null, "A Cowards Way Out", JOptionPane.INFORMATION_MESSAGE, icon);
                    Inventory.Bullets--;
                    try {
                        AscentoftheAlps.suicide();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        });

        btnCommitDie.setBounds(449, 270, 87, 23);
        appWindow.getContentPane().setLayout(null);
        appWindow.getContentPane().add(AnimationWindow);

        appWindow.getContentPane().add(lblNewLabel);
        appWindow.getContentPane().add(invPanel);
        invPanel.setLayout(null);
        appWindow.getContentPane().add(lblPlayerStats);
        appWindow.getContentPane().add(playerStats);
        playerStats.setLayout(null);
        appWindow.getContentPane().add(btnMove);
        appWindow.getContentPane().add(btnMap);
        appWindow.getContentPane().add(btnCommitDie);
        appWindow.getContentPane().add(btnSave);

        // All of the following code has to do with the character panels and setting their names and running their functions
        //__________________________________________________________________________________________________________________
        //__________________________________________________________________________________________________________________
        //__________________________________________________________________________________________________________________
        //__________________________________________________________________________________________________________________
        //__________________________________________________________________________________________________________________
        //Creates the drop menu for the possible team characters
        //Created by Taylor Conn
        final JComboBox teamList1 = new JComboBox(Var.team);
        teamList1.setBounds(108, 270, 170, 30);
        appWindow.getContentPane().add(teamList1);

        //Creates the label for what the side character is
        final JLabel Name1 = new JLabel("Choose A Party Member");
        Name1.setBounds(108, 238, 140, 30);
        appWindow.getContentPane().add(Name1);

        //Creates the first Character Panel
        final CharPanel charPanel_1 = new CharPanel();
        charPanel_1.setBounds(10, 235, 299, 110);
        appWindow.getContentPane().add(charPanel_1);

        //Checks what the selected Character is and changes the label
        teamList1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                String character = (String) cb.getSelectedItem();
                Name1.setText(character);
                if (character.equals("Merchant")) {
                    Var.merchant();
                } else if (character.equals("Priest")) {
                    Var.preist();
                } else if (character.equals("Dog")) {
                    Var.dog();
                } else if (character.equals("Elephant Tamer")) {
                    Var.elephantTamer();
                } else if (character.equals("Chef")) {
                    Var.chef();
                } else if (character.equals("Navigator")) {
                    Var.navigator();
                } else if (character.equals("Hunter")) {
                    Var.hunter();
                }
                teamList1.setEnabled(false);
            }
        });

        //Creates the drop menu for the possible team characters
        final JComboBox teamList2 = new JComboBox(Var.team);
        teamList2.setBounds(108, 390, 170, 30);
        appWindow.getContentPane().add(teamList2);

        //Creates the label for what the side character is
        final JLabel Name2 = new JLabel("Choose A Party Member");
        Name2.setBounds(108, 358, 140, 30);
        appWindow.getContentPane().add(Name2);

        //creates the second character panel
        CharPanel charPanel_2 = new CharPanel();
        charPanel_2.setBounds(10, 355, 299, 110);
        appWindow.getContentPane().add(charPanel_2);

        //Checks what the selected Character is and changes the label
        teamList2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                String character = (String) cb.getSelectedItem();
                Name2.setText(character);
                if (character.equals("Merchant")) {
                    Var.merchant();
                } else if (character.equals("Priest")) {
                    Var.preist();
                } else if (character.equals("Dog")) {
                    Var.dog();
                } else if (character.equals("Elephant Tamer")) {
                    Var.elephantTamer();
                } else if (character.equals("Chef")) {
                    Var.chef();
                } else if (character.equals("Navigator")) {
                    Var.navigator();
                } else if (character.equals("Hunter")) {
                    Var.hunter();
                }
                teamList2.setEnabled(false);
            }
        });

        //Creates the drop menu for the possible team characters
        final JComboBox teamList3 = new JComboBox(Var.team);
        teamList3.setBounds(108, 511, 170, 30);
        appWindow.getContentPane().add(teamList3);

        //Creates the label for what the side character is
        final JLabel Name3 = new JLabel("Choose A Party Member");
        Name3.setBounds(108, 479, 140, 30);
        appWindow.getContentPane().add(Name3);

        //Creates the third character panel
        CharPanel charPanel_3 = new CharPanel();
        charPanel_3.setBounds(10, 476, 299, 110);
        appWindow.getContentPane().add(charPanel_3);

        //Checks what the selected Character is and changes the label
        teamList3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                String character = (String) cb.getSelectedItem();
                Name3.setText(character);
                if (character.equals("Merchant")) {
                    Var.merchant();
                } else if (character.equals("Priest")) {
                    Var.preist();
                } else if (character.equals("Dog")) {
                    Var.dog();
                } else if (character.equals("Elephant Tamer")) {
                    Var.elephantTamer();
                } else if (character.equals("Chef")) {
                    Var.chef();
                } else if (character.equals("Navigator")) {
                    Var.navigator();
                } else if (character.equals("Hunter")) {
                    Var.hunter();
                }
                teamList3.setEnabled(false);
            }
        });

        //Creates the drop menu for the possible team characters
        final JComboBox teamList4 = new JComboBox(Var.team);
        teamList4.setBounds(108, 632, 170, 30);
        appWindow.getContentPane().add(teamList4);

        //Creates the label for what the side character is
        final JLabel Name4 = new JLabel("Choose A Party Member");
        Name4.setBounds(108, 600, 140, 30);
        appWindow.getContentPane().add(Name4);

        //Creates the fourth character panel
        CharPanel charPanel_4 = new CharPanel();
        charPanel_4.setBounds(10, 597, 299, 110);
        appWindow.getContentPane().add(charPanel_4);

        //Checks what the selected Character is and changes the label
        teamList4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                String character = (String) cb.getSelectedItem();
                Name4.setText(character);
                System.out.println(character);
                if (character.equals("Merchant")) {
                    Var.merchant();
                } else if (character.equals("Priest")) {
                    Var.preist();
                } else if (character.equals("Dog")) {
                    Var.dog();
                } else if (character.equals("Elephant Tamer")) {
                    Var.elephantTamer();
                } else if (character.equals("Chef")) {
                    Var.chef();
                } else if (character.equals("Navigator")) {
                    Var.navigator();
                } else if (character.equals("Hunter")) {
                    Var.hunter();
                }
                teamList4.setEnabled(false);
            }
        });
    }
}
