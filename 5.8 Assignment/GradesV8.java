
/**
 * To create methods for the GradesV8 class
 *
 * @author Amr Elhady
 * @version 1/15/23
 */
public class GradesV8
{
     private String n;
     private double g1;
     private double g2;
    
     public GradesV8( String name, double grade1, double grade2 )
     {
        n = name;
        g1 = grade1;
        g2 = grade2;
     }
     
     public GradesV8( String name )
     {
        n = name;
        g1 = 0.0;
        g2 = 0.0;
     }
     
     public String getName()
     {
        return n;
     }
     
     public double getGrade1()
     {
        return g1;
     }
     
     public double getGrade2()
     {
        return g2;
     }
     
     public void setName( String name )
     {
        n = name;
     }
        
     public void setGrade1( double grade1 )
     {
        g1 = grade1;
     }
     
     public void setGrade2( double grade2 )
     {
        g2 = grade2;
     }
     
     public double calcAverage()
     {
        return (g1 + g2) / 2 ;
     }
     
     public double calcAverage( double g1, double g2 )
     {
        return (g1 + g2) / 2;
     }
        
    
     
}
