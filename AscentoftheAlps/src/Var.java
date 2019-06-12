/**
 *
 * @author Taylor Conn
 */
public class Var {
    static Double foodConsumption = 2.0;
    static Double distancePerDay = 2.0;
    static Double clothingUsage = 2.0;
    static Double tradeYeild = 1.5;
    
    
    public void chef()
    {
        foodConsumption = foodConsumption * 0.85;
    }
    
    public void elephantTamer ()
    {
        distancePerDay = distancePerDay * 1.15;
    }
    
    public void merchant ()
    {
        tradeYeild = tradeYeild * 1.15;
    }
    
    public void navigator ()
    {
        AscentoftheAlps.distance = AscentoftheAlps.distance * 0.85;
    }
}
