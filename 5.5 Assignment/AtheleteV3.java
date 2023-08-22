
/**
 * To calculate different aspects of an athelete's training
 *
 * @author Amr Elhady
 * @version 1/6/23
 */
public class AtheleteV3
{
    public AtheleteV3(){
    
    }
    
    public double calcCals (double MET, double kg)
    {
        double cals = 0.0;
        cals = MET * kg;
        return cals;
    }
    public double weightLost (double kg, double pastkg)
    {
    double weightLost = pastkg - kg;
    return weightLost;
    }
}
