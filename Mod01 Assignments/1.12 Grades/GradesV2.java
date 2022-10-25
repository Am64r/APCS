
/**
 * class is used to calculate a student's test score average
 *
 * @author Amr Elhady
 * @version 9/3/22
 */
public class GradesV2
{
    public static void main(String [] args) 
    {
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests 
        double average = 0.0;  //average grade
        
        
        testGrade= 95;
        numTests++;
        average= (totalPoints + testGrade)/numTests;
        totalPoints+= testGrade;   
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        testGrade= 73;
        numTests++;
        average= (totalPoints + testGrade)/numTests;
        totalPoints+= testGrade;   
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        testGrade= 91;
        numTests++;
        average= (double)(totalPoints + testGrade)/numTests;
        totalPoints+= testGrade; 
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        testGrade= 82;
        numTests++;
        average= (double)(totalPoints + testGrade)/numTests;
        totalPoints+= testGrade; 
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        testGrade= 65;
        numTests++;
        average= (double)(totalPoints + testGrade)/numTests;
        totalPoints+= testGrade; 
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        testGrade= 100;
        numTests++;
        average= (double)(totalPoints + testGrade)/numTests;
        totalPoints+= testGrade; 
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        testGrade= 75;
        numTests++;
        average= (totalPoints + testGrade)/numTests;
        totalPoints+= testGrade; 
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        testGrade= 97;
        numTests++;
        average= (double)(totalPoints + testGrade)/numTests;
        totalPoints+= testGrade; 
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
        testGrade= 90;
        numTests++;
        average= (double)(totalPoints + testGrade)/numTests;
        totalPoints+= testGrade; 
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average);
        
    

    }
}
