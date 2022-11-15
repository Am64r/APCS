
/**
 * The purpose of this program is to illustrate the use of the
 * Math class ranomd() method.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
import java.util.Scanner;
public class RandomMethodDemo
{
    public static void main(String [] args)
    {
        int randomNumber;
        int counter = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers would you like generated? " );
        int choice = in.nextInt();

        while(counter <= choice)
        {
            randomNumber = (int)(Math.random() * 10) ;
            /*
            if( randomNumber > .4  && randomNumber < 0.6)
            {
                System.out.println( (counter) + ":\t " + (randomNumber) );
            }
            */
            System.out.println( (counter) + ":\t " + (randomNumber) );
            counter ++;
        }//end of while loop
    }//end of main method
}//end of class


/*
 *

if( randomNumber > 0.4 && random number < 0.6 )
{

}
 */