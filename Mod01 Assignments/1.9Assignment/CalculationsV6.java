
/**
 * To practice using int and double data types
 *  
 * @ author Amr Elhady
 * @ 9/1/22
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
       
        
        // Addition
        System.out.println("Addition");
        
        int iNum1 = 25;
        int iNum2 = 9; 
        int iNum3 = 11;
        
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;
        
        System.out.print(iNum1 + " + " + iNum2 + " = ");
        System.out.println(iNum1 + iNum2);
        
        System.out.print(dNum1 + " + " + dNum2 + " = ");
        System.out.println(dNum1 + dNum2);
        
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        
        System.out.print( iNum3 + " - " + iNum2 + " - " + iNum1 + " = ");
        System.out.println( iNum3 - iNum2 - iNum1);
        
        System.out.print( dNum2 + " - " + dNum3 + " = ");
        System.out.println(dNum2 - dNum3);
        
        System.out.println();
        
        
        // Multiplication
        System.out.println("Multiplication");
        
        System.out.print( iNum1 + " * " + iNum2 + " = ");
        System.out.println(iNum1 * iNum2);
        
        System.out.print( dNum2 + " * " + dNum3 + " * " + dNum3 + " = ");
        System.out.println(dNum2 * dNum3 * dNum3);
        
        System.out.println();
        
        // Division
        System.out.println("Division");
        
        System.out.print( iNum2 + " / " + iNum1 + " = " );
        System.out.println(iNum2/iNum1);
        
        System.out.print( dNum1 + " / " + dNum3 + " = " );
        System.out.println(dNum1/dNum3);
        
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        
        System.out.print( iNum3 + " % " + iNum2 + " = " );
        System.out.println(iNum3 % iNum2);
        
        System.out.print( dNum3 + " % " + dNum2 + " = " );
        System.out.println(dNum3%dNum2);
        
        System.out.println();
        
        //own additions
        System.out.println("Custom Equations");
        
        System.out.print(dNum3 + " * " + dNum1 + " - " + dNum2 + " = " );
        System.out.println(dNum3*dNum1-dNum2);
        
        System.out.print(dNum2 + " + " + dNum3 + " % " + dNum1 + " = " );
        System.out.println(dNum2+dNum3%dNum1);
        
        System.out.print(dNum1 + " % " + dNum3 + " * " + dNum2 + " = " );
        System.out.print(dNum1%dNum3*dNum2);
        
        
        // 1.08 Additional int Equations
        
        
        // 1.09 Additional double Equations
        
               
    } // end of main method
} // end of class
