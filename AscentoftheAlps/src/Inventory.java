/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1mccubbinaid
 */
public class Inventory {
    

    
    static Double foodSupply = 11.1;
    static Double distance = 1000.0;  

    public static Double getfoodSupply() {
        return foodSupply;
    }

    public void setfoodSupply(double f) {
        foodSupply = f;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(double f) {
        distance = f;
    }
    
    public String StringFoodSupply(){
        return foodSupply.toString();
    }
}
