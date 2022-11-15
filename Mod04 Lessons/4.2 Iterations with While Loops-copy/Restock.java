
/**
 * This program simulates the fish population within a pond and predicts
 * when to restock based on the growth delay formula. The while loop
 * terminates when the population goes below a desired value.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
public class Restock
{
    public static void main(String[] args)
    {
        int year = 2000;             //initial year
        int fishPop = 30000;         //max fish population
        double decreaseRate = .224;  //annual rate of decrease

        while(fishPop >= 1500)
        {
            fishPop -= (int)(fishPop * decreaseRate);
            year++;
        }
        System.out.println("In " + year + " the fish population will decrease to "  + fishPop );
                                                       
                            
        int n = 314159; 
        int m = 0; 
        while ( n > 0 ) 
        { 
          m = 10 * m + n % 10; 
          n /= 10; 
        }
        System.out.println( m );
        
        
        
       }//end of main method
}//end of class
