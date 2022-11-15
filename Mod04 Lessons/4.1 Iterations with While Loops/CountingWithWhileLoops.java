
/**
 * The purpose of this program is to illustrate the use of the
 * while loop as a counter.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
public class CountingWithWhileLoops
{
    public static void main(String [] args)
    {
        double counter =  0;
        double theTerminator = 0.5;          //initialize the terminating value

        /*
        while(counter < theTerminator)     //test the terminating condition
        {
            if(counter < 0)
            {
                System.out.println("counter = " + ( counter + 1) );
            }
            
            else 
            {
                System.out.println("counter = " + (theTerminator - counter) );
            }
            
            counter++;
        }//end of while loop
        */
        while(counter < theTerminator)     //test the terminating condition
        {
            System.out.println(counter);
            counter += 0.01;
        }//end of while loop
    }//end of main method
}//end of class
