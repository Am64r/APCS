/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Amr Elhdy
 * @version 9/4/22
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;        // starting US Dollars

        double pesosSpent = 7000;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        //remaining variables below here

        double yenSpent = 250000;            
        double yenExchangeRate = 140.21;     
        double dollarsSpentInJapan = 0.0;      
        double dollarsAfterJapan = 0.0;  

        double egyptianPoundsSpent = 60000;            
        double egyptianPoundsExchangeRate = 19.23;     
        double dollarsSpentInEgypt = 0.0;      
        double dollarsAfterEgypt = 0.0;  

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
    
        System.out.println("Starting US dollars:\t" + startingUsDollars + "\n");
        
        System.out.println("Mexico:");
        System.out.println(" Pesos Spent:\t\t" + pesosSpent);
        dollarsSpentInMexico=pesosSpent/pesoExchangeRate;
        System.out.println(" US dollars equivalent:\t" + dollarsSpentInMexico);
        dollarsAfterMexico= (startingUsDollars - dollarsSpentInMexico);
        System.out.println(" US dollars remaining:\t" + dollarsAfterMexico);
        System.out.println();
        
        System.out.println("Japan:");
        System.out.println(" Yen Spent:\t\t" + yenSpent);
        dollarsSpentInJapan=yenSpent/yenExchangeRate;
        startingUsDollars-=dollarsSpentInMexico;
        dollarsAfterJapan= (startingUsDollars - dollarsSpentInJapan);
        System.out.println(" US dollars equivalent:\t" + dollarsSpentInJapan);
        System.out.println(" US dollars remaining:\t" + dollarsAfterJapan);
        System.out.println();
        
        System.out.println("Egypt:");
        System.out.println(" Egyptian Pounds Spent:\t" + egyptianPoundsSpent);
        dollarsSpentInEgypt=egyptianPoundsSpent/egyptianPoundsExchangeRate;
        startingUsDollars-=(dollarsSpentInMexico+dollarsSpentInJapan);
        dollarsAfterEgypt= (startingUsDollars - dollarsSpentInEgypt);
        System.out.println(" US dollars equivalent:\t" + dollarsSpentInEgypt);
        System.out.println(" US dollars remaining:\t" + dollarsAfterEgypt);
        System.out.println("================================================");
        
        System.out.println("Remaining US dollars:\t" + dollarsAfterEgypt);
        
        
        System.out.println();


        // Complete the code below for Souvenir Purchases
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                          //cost per item of first souvenir
        int budget1 = 675;                           //budget for first item
        int totalItems1 = 0;  //how many items can be purchased
        int fundsRemaining1 = 0;
        
        
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        totalItems1 = budget1/costItem1;
        System.out.println("   Total items purchased: " +  totalItems1);
        fundsRemaining1 = budget1%costItem1;
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();
        

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                          //cost per item of second souvenir
        int budget2 = 700;                               //budget for second item
        int totalItems2 = 0;     //how many items can be purchased
        double fundsRemaining2 = 0 ;      //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        totalItems2 =(int)(budget2/costItem2);
        System.out.println("   Total items purchased: " +  totalItems2);
        fundsRemaining2 = budget2%costItem2;
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

