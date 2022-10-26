
/**
 * To practice using the math. method
 *
 * @author Amr Elhady
 * @version 9/7/22
 */
public class PyTheorem
{
    public static void main(String [] args) 
    {
        
        int side1 = (int)(Math.random() * 18) + 5;
        int side2 = (int)(Math.random() * 18) + 5;
        
        double hypotenuse1 = Math.sqrt((Math.pow(side1, 2) +(Math.pow(side2,2))));
    
        System.out.print("Triangle 1\t");
        System.out.print("Side 1: " + side1 +"\t");
        System.out.print("Side 2: " + side2 +"\t");
        System.out.println("Hypotenuse: " + hypotenuse1);
        
        int side3 = (int)(Math.random() * 18) + 5;
        int side4 = (int)(Math.random() * 18) + 5;
        
        double hypotenuse2 = Math.sqrt((Math.pow(side3, 2) +(Math.pow(side4,2))));
        
        System.out.print("Triangle 2\t");
        System.out.print("Side 1: " + side3 +"\t");
        System.out.print("Side 2: " + side4 +"\t");
        System.out.print("Hypotenuse: " + hypotenuse2);
        
        System.out.println();
        
    }

}
