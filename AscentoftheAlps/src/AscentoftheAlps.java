/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.applet.*;
import javax.sound.sampled.LineUnavailableException;
import sun.audio.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
/**
 *
 * @author 1mccubbinaid
 */
public class AscentoftheAlps {

    static double distance = 2000;
    static int disttraveled = 0;
    static boolean eventtrigger = false;
    static boolean stop = false;
    static boolean haschef = false;
   
    static boolean movement = false;
   
    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws LineUnavailableException  {
        GUI.main(null);
//        try {
//    File file = new File((getResource("/8bit.WAV")).getFile());
//    AudioInputStream stream;
//    AudioFormat format;
//    DataLine.Info info;
//    Clip clip;
//
//    stream = AudioSystem.getAudioInputStream(file);
//    format = stream.getFormat();
//    info = new DataLine.Info(Clip.class, format);
//    clip = (Clip) AudioSystem.getLine(info);
//    clip.open(stream);
//    clip.start();
//    print(clip);
//
//}
//catch (Exception e) {
//    //whatevers
//    e.printStackTrace();
//}

    }
static <T> void print(T e){System.out.println(e);}
    public static void day() throws InterruptedException {

        for (int i = 0;i < 5; i++){

            System.out.println(movement);
            Inventory.foodSupply -= Var.foodConsumption;
            Inventory.Distance -= Var.distancePerDay;
            Events.runEvents();
            Inventory.foodSupply.toString();
            InventoryPanel.updateInventory();
            Thread.sleep(300);
            
            
           //when day is triggered, run foodconsumption, distance and roll for events
        }
        int i = 0;
        }
public static void suicide() throws InterruptedException {
  Thread.sleep(1000);

  System.exit(1);
  
}




       


    }

