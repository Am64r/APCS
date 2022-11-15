
/**
 * to count the total of different combinations of children pairs
 *
 * @author Amr Elhady
 * @version 11/13/2022
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
  public static void main(String [] args) throws IOException
  {
    
    String token = "";
    File fileName = new File("familyMembers.txt");
    Scanner inFile = new Scanner(fileName);

    int BB = 0;
    int BGorGB = 0;
    int GG = 0;
    
    while( inFile.hasNextLine() )
    {
        token = inFile.nextLine();
        
        if ( token.equals("BB") )
        {
          BB++;
        }
        
        else if ( token.equals("BG") || token.equals("GB") )
        {
          BGorGB++;
        }
        
        else if (token.equals("GG"))
        {
          GG++;
        }
    }
    
    int totalFam = BB + BGorGB + GG;
    
    double percentBB = (double)BB/totalFam * 100;
    double percentBGorGB = (double)BGorGB/totalFam * 100;
    double percentGG = (double)GG/totalFam * 100;
       
    System.out.println("Composition statistics for families with two children.");
    System.out.println();
    
    System.out.println("Total number of families: " + totalFam);
    System.out.println();
    
    System.out.println("Number of families with");
    System.out.println("\t   2 boys: " + BB + " represents " + (int)percentBB + "%");
    System.out.println("\t  2 girls: " + GG + " represents " + (int)percentGG + "%");
    System.out.println(" 1 boy and 1 girl: " + BGorGB + " represents " + (int)percentBGorGB + "%");
   
  }
}
