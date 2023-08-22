
/**
 * To display different aspects of an athelete's training
 *
 * @author Amr Elhady
 * @version 1/6/23
 */
public class AtheleteTesterV3
{
    public static void printAthelete(String n, double calories, String activity, double weightLost)
    {
        System.out.println("Athelete " + n + " has burned " + calories + " calories while " + activity + ".");
        System.out.println("Athelete " + n + " has lost " + weightLost + " pounds.");
        System.out.println();
    }
    private static void AtheleteInfo( String name, double MET, double kg, String activity, double pastkg )
    {
        double calsBurned = 0.0;
        double weightLost = 0.0;
        AtheleteV3 Athelete = new AtheleteV3();
        
        calsBurned =  Athelete.calcCals(MET, kg); 
        weightLost = Athelete.weightLost(kg, pastkg);
        
        printAthelete(name, calsBurned, activity, weightLost);
    }
    public static void main(String [] args )
    {
        AtheleteInfo("Amr", 14, 70, "biking", 80);
        AtheleteInfo("Tyreek", 8 , 80, "running", 90);
        System.out.println();
    
    }
}
