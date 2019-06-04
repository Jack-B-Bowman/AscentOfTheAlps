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
    double food = 100;
    boolean haschef = false;
    int partynum = 0;
    int eatrate = 1;
    double eatfood;
    int gin;
    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }

    public void move() {


        if (stop = true) {
        } else {
            while (disttraveled != distance) {
                disttraveled++;
                //keep going until disstraveled has counted up to = distance
                System.out.println(disttraveled);
                if (disttraveled % 10 == 0) {
                    //every 10 nth distance do a food operation
                    if (haschef = true) {
                        food = food - eatfood;
                        System.out.println("You have " + food + "units of food left");
                        //calculaions differ if haschef = true
                    } else {
                        food = food - eatfood;
                        System.out.println("You have " + food + "units of food left");
                        // calculations differ if haschef = false
                    }
                }



                if (eventtrigger = true) {
                    break;
                    //travel forever until an event happens, then break out of the loop
                }
            }

        }

    }
}
