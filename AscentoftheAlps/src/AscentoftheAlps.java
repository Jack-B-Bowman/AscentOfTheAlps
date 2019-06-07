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

    int distance = 2000;
    int disttraveled = 0;
    boolean eventtrigger = false;
    boolean stop = false;
    boolean haschef = false;
    int partynum = 0;
    double eatfood;
    
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
                    
//        if (stop = true) {
//        } else {
//            while (disttraveled != distance) {
//
//
//
//                System.out.println(disttraveled);
//
//                if (haschef = true) {
//                    eatfood = partynum - 1;
//                    food = food - eatfood;
//                    System.out.println("You have " + food + "units of food left");
//                    //calculations differ if haschef = true (use 1 less food)
//
//                } else {
//                    eatfood = partynum;
//                    food = food - eatfood;
//                    System.out.println("You have " + food + "units of food left");
//                    // calculations differ if haschef = false (use default food)
//                }
//
//
//
//
//                if (eventtrigger = true) {
//                    break;
//
//                    //travel forever until an event happens, then break out of the loop
//                }
//                if (stop = true) {
//                    break;
//                }
//
//
//            }
//
//        }

    }
}
