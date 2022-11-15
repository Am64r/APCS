
/**
 * Write a description of class tokenPicker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TokenPicker
{
  public static void main( String [] args )
  {
      int redTokens = 0;
      int blueTokens = 0;
      int pickCount = 1;
      int totalPicks = 0;
      double randNum = 0.0;
      
      while(pickCount <= 10)
      {
          randNum = Math.random();
          
          System.out.print(pickCount + "\t" + randNum);
          
          if(randNum < 0.2)
          {
            redTokens++;
            System.out.println("\t red token");
            }
          else 
          {
            blueTokens++;
            System.out.println("\t blue token");
            }
          pickCount++;
        }
        
        
      
      
      // if less than .2 then red, else blue 
      
  }
}
