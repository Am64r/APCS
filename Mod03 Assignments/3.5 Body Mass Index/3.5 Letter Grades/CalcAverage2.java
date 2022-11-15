
/**
 * This program illustrates the use of the if-else-if structure 
 * and determines a student's letter grade based on an average.
 *
 * @author George Boole
 * @version 06/04/17
 */
import java.util.Scanner;
public class CalcAverage2
{
    public static void main(String[] args)
    {
        
        String letterGrade = "";
        Scanner in = new Scanner(System.in);

        //Gather input
        System.out.println("Letter Grade Calculator");
        System.out.println();
        System.out.println("Enter 5 grades separated by a space (e.g. 98 85 79 100 89)): ");
        int grade1 = in.nextInt();
        int grade2 = in.nextInt();
        int grade3 = in.nextInt();
        int grade4 = in.nextInt();
        int grade5 = in.nextInt();

        //Calculate average
        double average = (double)(grade1 + grade2 + grade3 + grade4 + grade5)/5;

        //Determine letter grade
        if(average >= 90)
            letterGrade = "A";
        else if(average >= 80)
            letterGrade = "B";
        else if(average >= 70)
            letterGrade = "C";
        else if(average >= 60)
            letterGrade = "D";
        else
            letterGrade = "F";

        //Print output
        System.out.println("Average: " + average);
        System.out.println("Grade: " + letterGrade);
        
        /*
        String str = "APCS";
        String str1 = "" + str.charAt(0);
        String str2 = "" + str.charAt(0);
        System.out.println("The string values: " + str1 + " and " + str2);
        System.out.println(" str1 == str2 : " + (str1 == str2) );
        System.out.println(" str1.equals(str2) : " + str1.equals(str2) );
        */
            }
}
