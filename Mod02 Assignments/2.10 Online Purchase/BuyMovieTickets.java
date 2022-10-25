
/**
 * to take input on a movie ticket transaction in string form; then parse, use string 
 * methods and casting to produce results
 *
 * @author Amr Elhady
 * @version 9/17/22
 */
import java.util.Scanner;
import java.util.Random;
public class BuyMovieTickets
{
    public static void main(String [ ] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Good Evening.");
        
        System.out.print("Please enter your first and last name: ");
        String firstName = in.next();
        String lastName = in.nextLine();
        
        System.out.print("Please enter today's date (mm/dd/yyyy): ");
        String date = in.next();
        
        System.out.print("What movie would you like to see? ");
        String movie = in.next();
        String restOfMovie = in.nextLine();
        
        System.out.print("How many tickets would you like? ");
        String numTickets = in.next();
        int numTicketsInt = Integer.parseInt(numTickets);
        
        System.out.print("What is the ticket price? ");
        String ticketPrice = in.next();
        double ticketPriceDouble = Double.parseDouble(ticketPrice);
        
        System.out.print("Please enter your credit card number (#####-###-####): ");
        String cardNumber = in.next();
        
        System.out.print("Enter your pin: ");
        String pinNumber = in.next();
        
        System.out.println();
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        
        System.out.println("Your e-Reciept");
        System.out.println();
        
        String formattedDate = date.replaceAll("/","-");
        System.out.println(formattedDate);
        
        Random rnd = new Random();
        char a = (char) ('a' + rnd.nextInt(26));
        char b = (char) ('a' + rnd.nextInt(26));
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);
        System.out.println("Order number: " + a + b + num1 + num2 + num3);
        System.out.println();
        
        String name = firstName + lastName;
        String newName = firstName.substring(0,1) + ". " + lastName;
        System.out.println("  " + newName);
        
        String lastFour = cardNumber.substring(10);
        System.out.println("  Account: #####-###-" + lastFour);
        
        System.out.println("  Movie: " + movie + restOfMovie);
        
        System.out.println("  Number of Tickets: " + numTicketsInt);
        
        System.out.println("  Ticket Price: " + ticketPriceDouble);
        
        double totalCost = numTicketsInt * ticketPriceDouble;
        System.out.println();
        
        System.out.println("  $" + totalCost + " will be debited to your account.");
        System.out.println();
        
        System.out.println("  Thank you. Enjoy your movie tonight.");
        
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        
        
       
        
    
    }
}
