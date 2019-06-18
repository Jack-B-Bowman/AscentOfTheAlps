
/**
 *
 * @author Taylor Conn
 */
public class Var {

    static Double foodConsumption = 2.0;
    static Double distancePerDay = 0.0;
    static Double clothingUsage = 2.0;
    static Double tradeYeild = 1.5;
    static Double health = 100.0;
    static boolean hasChef = false;
    static boolean hasElephantTamer = false;
    static boolean hasMerchant = false;
    static boolean hasNavigator = false;
    static boolean hasDog = false;
    static boolean hasPreist = false;
    static boolean hasHunter = false;
    static String[] team = {"Merchant", "Chef", "Navigator", "Dog", "Priest", "Hunter", "Elephant Tamer"};

    static public void setDisatancePerDay() {
        distancePerDay = 20.0 * Inventory.Elephants;
    }

    static public void hunter() {
        Inventory.foodSupply = Inventory.foodSupply * 1.15;
        hasHunter = true;
    }

    static public void hunterDie() {
        Inventory.foodSupply = Inventory.foodSupply * 0.85;
        hasHunter = false;
    }

    static public void preist() {
        hasPreist = true;
    }

    static public void presitDie() {
        hasPreist = false;
    }

    static public void dog() {
        health = health * 2;
        hasDog = true;
    }

    static public void dogDie() {
        health = health * 0.5;
        hasDog = false;
    }

    static public void chef() {
        foodConsumption = foodConsumption * 0.85;
        hasChef = true;
    }

    static public void chefDie() {
        foodConsumption = foodConsumption * 1.15;
        hasChef = false;
    }

    static public void elephantTamer() {
        distancePerDay = distancePerDay * 1.15;
        hasElephantTamer = true;
    }

    static public void elephantTamerDie() {
        distancePerDay = distancePerDay * 0.85;
        hasElephantTamer = false;
    }

    static public void merchant() {
        tradeYeild = tradeYeild * 1.15;
        hasMerchant = true;
    }

    static public void merchantDie() {
        tradeYeild = tradeYeild * 0.85;
        hasMerchant = false;
    }

    static public void navigator() {
        AscentoftheAlps.distance = AscentoftheAlps.distance * 0.85;
        hasNavigator = true;
    }

    static public void navigatorDie() {
        AscentoftheAlps.distance = AscentoftheAlps.distance * 1.15;
        hasNavigator = false;
    }
}
