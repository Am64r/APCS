
/**
 * To calculate total daily energy expenditure
 *
 * @author Amr Elhady
 * @version 11/6/2022
 */
import java.util.Scanner;
public class TDEE
{
   public static void main(String [] args)
   {
    double TDEE;
    double activityFactor;
    Scanner in = new Scanner(System.in);
    
    System.out.print("Please enter your name: ");
    String firstName = in.next();
    String lastName = in.nextLine();
    String fullName = firstName + " " + lastName;
    
    System.out.print("Please enter your BMR: ");
    double bmr = in.nextInt();
    
    System.out.print("Please enter your gender (M/F): ");
    String gender = in.next();
    System.out.println();
    
    System.out.println("Select Your Activity Level");
    System.out.println("[A] Resting (Sleeping, Reclining)");
    System.out.println("[B] Sedentary (Restricted Mobility)");
    System.out.println("[C] Light (Sitting, Standing)");
    System.out.println("[D] Moderate (Light Manual Labor, Dancing, Biking)");
    System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
    System.out.println("[F] Extremely Active (Full time Athelete, Heavy Manual Labor)");
    System.out.println();
    
    System.out.print("Enter the lettter corresponding to your activity level: ");
    String activityLevel = in.next();
    System.out.println();
    
    if((gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) && activityLevel.equalsIgnoreCase("A"))
    {
        activityFactor = 1.0;
    }
    
    else if((gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) && activityLevel.equalsIgnoreCase("B"))
    {
        activityFactor = 1.3;
    }
    
    else if(gender.equalsIgnoreCase("M") && activityLevel.equalsIgnoreCase("C"))
    {
        activityFactor = 1.6;
    }
     
    else if(gender.equalsIgnoreCase("M") && activityLevel.equalsIgnoreCase("D"))
    {
        activityFactor = 1.7;
    }
     
    else if(gender.equalsIgnoreCase("M") && activityLevel.equalsIgnoreCase("E"))
    {
        activityFactor = 2.1;
    }
     
    else if(gender.equalsIgnoreCase("M") && activityLevel.equalsIgnoreCase("F"))
    {
        activityFactor = 2.4;
    }
     
    else if(gender.equalsIgnoreCase("F") && activityLevel.equalsIgnoreCase("C"))
    {
        activityFactor = 1.5;
    }
     
    else if(gender.equalsIgnoreCase("F") && activityLevel.equalsIgnoreCase("D"))
    {
        activityFactor = 1.6;
    } 
    
    else if(gender.equalsIgnoreCase("F") && activityLevel.equalsIgnoreCase("E"))
    {
        activityFactor = 1.9;
    } 
    
    else 
    {
        activityFactor = 2.2;
    }
     
    System.out.println("Your Results: ");
    System.out.print("Name: " + fullName + "\t\t");
    System.out.println("Gender: " + gender.toUpperCase() );
    System.out.print("BMR: " + bmr + " calories" + "\t");
    System.out.println("Activity Factor: " + activityFactor);
    
    TDEE = bmr * activityFactor;
    
    System.out.println("TDEE: " + TDEE + " calories");
    
    
    }
}
