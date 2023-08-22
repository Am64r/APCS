
/**
 * To use constructors to create variable objects
 *
 * @author Amr Elhady
 * @version 1/15/23
 */
public class GradesV8Tester
{
    public static void header()
    {
     System.out.println("Student \t Grade 1 \t Grade2 \t Average");
     System.out.println("==========================================================");
     
    }
    
    public static void main( String [] args )
    {
        header();
        
        double average = 0.0;
        
        GradesV8 student1 = new GradesV8("Sam", 98, 79);
        average = student1.calcAverage();
        System.out.println( student1.getName() + "\t\t" + student1.getGrade1() + "\t\t" + student1.getGrade2() + "\t\t" + average );
        
        GradesV8 student2 = new GradesV8("Michael", 88, 90);
        average = student2.calcAverage();
        System.out.println( student2.getName() + "\t\t" + student2.getGrade1() + "\t\t" + student2.getGrade2() + "\t\t" + average );

        GradesV8 student3 = new GradesV8("Bob", 55, 45);
        average = student3.calcAverage();
        System.out.println( student3.getName() + "\t\t" + student3.getGrade1() + "\t\t" + student3.getGrade2() + "\t\t" + average );

        /*GradesV8 student4 = new GradesV8("Tim");
        average = student4.calcAverage();
        System.out.println( student4.getName() + "\t\t" + student4.getGrade1() + "\t\t" + student4.getGrade2() + "\t\t" + average );*/

        String name5 = "Tyler";
        double s5g1 = 90;
        double s5g2 = 89;
        
        GradesV8 student5 = new GradesV8(name5);
        average = student5.calcAverage(s5g1,s5g2);
        System.out.println( student5.getName() + "\t\t" + s5g1 + "\t\t" + s5g2 + "\t\t" + average );

        
        
        
    }
}
