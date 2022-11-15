
/**
 * to calculate bmi
 *
 * @author Amr Elhady
 * @version 9/6/22
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String [] args) 
    {
        String category = "";
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        String name = firstName + "" + lastName;
        
        System.out.print("Enter your weight in pounds (e.g. 175): ");
        int weightLbs = in.nextInt();
        
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        int heightFeet = in.nextInt();
        int heightInch = in.nextInt();
        
        double totalHeightFeet = heightFeet + ((double)heightInch/12);
        
        double weightKg = weightLbs / 2.205;
        double heightMeters = totalHeightFeet * 0.3048 ;
        
        double heightSquared = Math.pow(heightMeters,2);
        
        double bmi = weightKg / heightSquared;
        
        if(bmi < 18.5)
            category = "UnderWeight";
        else if(bmi < 24.9)
            category = "Healthy Weight";
        else if(bmi < 29.9) 
            category = "Overweight";
        else
            category = "Obese";
        
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + (int)(10 * heightMeters)/10.0);
        System.out.println("Weight (kg): " + (int)(10 * weightKg)/10.0);
        System.out.println("BMI: " + (int)(10 * bmi)/10.0);
        System.out.println("Category: " + category);
        
        
        
    }
}
