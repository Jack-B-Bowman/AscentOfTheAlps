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
         foodConsumption * 0.85;
    }
    
    public Double elephantTamer ()
    {
        return distancePerDay * 1.15;
    }
    
    public Double merchant ()
    {
        return tradeYeild * 1.15;
    }
    
    public Double navigator ()
    {
        return AscentoftheAlps.distance * 0.85;
    }
}
