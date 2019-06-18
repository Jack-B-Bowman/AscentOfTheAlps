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

    static double distance = 2000;
    static int disttraveled = 0;
    static boolean eventtrigger = false;
    static boolean stop = false;
    static boolean haschef = false;
    static boolean movement = false;

    public static void main(String[] args) throws LineUnavailableException {
        GUI.main(null);
    }

    static <T> void print(T e) {
        System.out.println(e);
    }

    public static void day() throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            if (Var.health <= 0) {
                JOptionPane.showMessageDialog(null, "You Have Died");
                System.exit(0);
            }

            Var.setDisatancePerDay();
            System.out.println(Var.distancePerDay);
            System.out.println(movement);
            Inventory.foodSupply -= Var.foodConsumption;
            Inventory.Distance -= Var.distancePerDay;
            Events.runEvents();
            Inventory.foodSupply.toString();
            InventoryPanel.updateInventory();
            PlayerStats.dayOfYear++;
            PlayerStats.ld = PlayerStats.y.atDay(PlayerStats.dayOfYear);
            PlayerStats.callTogether();
            Thread.sleep(300);
            //when day is triggered, run foodconsumption, distance and roll for events
        }
    }

    public static void suicide() throws InterruptedException {
        Thread.sleep(1000);
        System.exit(0);
    }
}
