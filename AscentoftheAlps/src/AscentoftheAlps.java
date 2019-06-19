import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.applet.*;
import javax.sound.sampled.LineUnavailableException;
import sun.audio.*;
import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.Year;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author 1mccubbinaid, Taylor Conn finished it off
 */
public class AscentoftheAlps {

    static boolean movement = false;

    public static void main(String[] args) throws LineUnavailableException {
        GUI.main(null);
        //starts the GUI
    }

    static <T> void print(T e) {
        System.out.println(e);
    }

    public static void day() throws InterruptedException {

        for (int i = 0; i < 4; i++) {
            if (Var.health <= 0) {
                JOptionPane.showMessageDialog(null, "You Have Died. Rome lives to see another day but you do not");
                System.exit(0);
                // taylor's player health system, below 0 is death
            }
            InventoryPanel.isDone();
            InventoryPanel.halfway();
            Var.setDisatancePerDay();
            System.out.println(Var.distancePerDay);
            System.out.println(movement);
            Inventory.foodSupply -= Var.foodConsumption;
            Inventory.Distance -= Var.distancePerDay;
            // food consumption calculations
            Events.runEvents();
            //Inventory.foodSupply.toString();
            InventoryPanel.updateInventory();
            PlayerStats.dayOfYear++;
            PlayerStats.ld = PlayerStats.y.atDay(PlayerStats.dayOfYear);
            InventoryPanel.outOfFood();
            PlayerStats.callTogether();
            Thread.sleep(200);
            //when day is triggered, run foodconsumption, distance and roll for events
        }
    }

    public static void suicide() throws InterruptedException {
        Thread.sleep(1000);
        System.exit(0);
        // just wait and then exit when the suicide button is pressed
    }
}
