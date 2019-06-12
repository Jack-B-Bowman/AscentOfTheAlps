/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

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
    static int partynum = 0;
    static double eatfood;
    
    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI.main(null);
    }

    public static void day() {

                    Inventory.foodSupply -= Var.foodConsumption;
                    Inventory.Distance -= Var.distancePerDay;
                    Events.runEvents();
//when day is triggered, run foodconsumption, distance and roll for events
       


    }
}
